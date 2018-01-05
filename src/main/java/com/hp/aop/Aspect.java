package com.hp.aop;

import com.hp.annotation.UserDefined;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * usedfor：注解测试类
 * Created by javahao on 2017/7/5.
 * auth：JavaHao
 */
@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    /**
     * 获取自定义注解的相关处理
     * @param jp 切入点
     * @param userdefined 自定义注解 一定得跟@annotation(userdefined)中的参数相同
     * @throws Throwable 异常
     */
    @Before(value="@annotation(userdefined)")
    public void permission(JoinPoint jp, UserDefined userdefined) throws Throwable{
        //获取到切入点方法中参数的值
        Object[] args = jp.getArgs();
        for (Object o : args){
            System.out.println(o.toString());
        }
        //没发现直接通过切入点获取方法返回值类型的方法，思路是获取到所属类然后通过所属类获取声明的方法获取返回类型
        //获取切入点的所属类
        Class aspectClz = jp.getTarget().getClass();
        //判断所属类上面是否也声明了UserDefined注解
        if(aspectClz.isAnnotationPresent(UserDefined.class)){
            //获取到所属类的注解
            UserDefined clzA = (UserDefined) aspectClz.getAnnotation(UserDefined.class);
            //获取切入点的注解中的属性
            String methodAV = userdefined.value();

            System.out.println("切入点的注解中的属性value值:"+methodAV);
            System.out.println("所属类的注解中的属性value值:"+clzA.value());
        }
    }
}
