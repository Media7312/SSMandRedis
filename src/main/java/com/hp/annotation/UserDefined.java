package com.hp.annotation;

import java.lang.annotation.*;

/**
 * usedfor：
 * Created by javahao on 2017/7/5.
 * auth：JavaHao
 */
@Documented
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserDefined {
    String name() default "";
    String value() default "";
}
