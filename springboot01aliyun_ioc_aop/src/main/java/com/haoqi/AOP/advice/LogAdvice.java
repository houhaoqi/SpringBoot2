package com.haoqi.AOP.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author haoqi
 * @Date 2022/3/3 - 20:25
 */
@Aspect
@Component
public class LogAdvice {
    //定义一个切点，所有被getMapping注解修饰的都会织入advice
    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    private void logAdvicePointCut() {
    }

    // Before表示logAdvice将在目标方法执行前执行
    @Before("logAdvicePointCut()")
    public void logAdvice() {
        System.out.println("1.logAdvice 请求advice触发。。。");
    }
}
