package com.example.aop;

/**
 * @author haoqi
 * @Date 2022/3/16 - 10:48
 */

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;


@Slf4j
@Aspect            //使用@Aspect注解将一个java类定义为切面类
@Order(5)
@Configuration
public class WebLogAspect {

    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    //使用@Pointcut定义一个切入点，可以是一个规则表达式，比如下例中某个package下的所有函数，也可以是一个注解等。
    @Pointcut("execution(public * com.example.service.*.*(..))")
    public void webLog() {
    }

    //使用@Before在切入点开始处切入内容
    //前置通知，请求方法之前拦截
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());

        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        log.info("请求URL : " + request.getRequestURL().toString());
        log.info("请求HTTP_METHOD : " + request.getMethod());
        log.info("请求IP : " + request.getRemoteAddr());
        log.info("请求CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("请求参数值 : " + Arrays.toString(joinPoint.getArgs()));

    }


    //使用@AfterReturning在切入点return内容之后切入内容（可以用来对处理返回值做一些加工处理）
    //目标方法请求之后打印响应信息
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        log.info("响应RESPONSE : " + ret);
        log.info("响应时间SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }

}

