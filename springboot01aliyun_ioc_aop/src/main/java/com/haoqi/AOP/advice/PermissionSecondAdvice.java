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
 * @Date 2022/3/3 - 22:46
 */
@Aspect
@Component
@Order(0)
public class PermissionSecondAdvice {

    @Pointcut("@annotation(com.haoqi.AOP.annotation.PermissionAnnotation)")
    private void permissionCheck() {
    }

    @Around("permissionCheck()")
    public Object permissionCheckSecond(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("===================第二个切面===================：" + System.currentTimeMillis());

        //获取请求参数，详见接口类
        Object[] objects = joinPoint.getArgs();
        Long id = ((JSONObject) objects[0]).getLong("id");
        String name = ((JSONObject) objects[0]).getString("name");

        // name不是管理员则抛出异常
        if (!name.equals("admin")) {
            System.out.println("用户不是管理员！");
            return JSON.parseObject("{\"message\":\"not admin\",\"code\":403}");
        }
        System.out.println("id1->>>>>>>>> " + id);
        System.out.println("name1->>>>>>> " + name);
        return joinPoint.proceed();
    }
}

