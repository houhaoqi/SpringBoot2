package com.haoqi.AOP.advice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author haoqi
 * @Date 2022/3/3 - 21:19
 */
@Aspect //@Aspect是将该类声明为切面类
@Component //@component把该类实例化放入到spring容器中，
@Order(1)
public class PermissionFirstAdvice {
    //定义一个切面，写入自定义注解的路径
    @Pointcut("@annotation(com.haoqi.AOP.annotation.PermissionAnnotation)")
    private void permissionCheck() {
    }

    //选择一个处理时机
    @Around("permissionCheck()")
    public Object permissionCheckFirst(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("===================第一个切面===================：" + System.currentTimeMillis());
        // 获取请求参数 （阅读接口类）
        Object[] objects = joinPoint.getArgs();
        Long id = ((JSONObject) objects[0]).getLong("id");
        String name = ((JSONObject) objects[0]).getString("name");

        //id小于0 则抛出异常
        if (id < 0) {
            System.out.println("输入参数异常！");
            return JSON.parseObject("{\"message\":\"not admin\",\"code\":403}");
        }
        System.out.println("id1->>>>>>>>> " + id);
        System.out.println("name1->>>>>>> " + name);
        return joinPoint.proceed();
    }
}
