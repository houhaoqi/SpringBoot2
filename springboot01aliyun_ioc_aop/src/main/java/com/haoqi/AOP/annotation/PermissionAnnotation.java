package com.haoqi.AOP.annotation;

import java.lang.annotation.*;

/**
 * @author haoqi
 * @Date 2022/3/3 - 21:17
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PermissionAnnotation {
}
