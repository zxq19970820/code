package com.zxq.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/2 22:26
 * 4
 */

@Component
@Aspect //表示当前是一个切面类
public class logger {


    @Pointcut("execution(* com.zxq.service.impl.*.*(..))")
    private void pt1() {
    }


    /**
     * 后置通知
     */
    @AfterReturning("pt1()")
    public void beforePrintLog() {
        System.out.println("前置通知Logger类中的beforePrintLog方法开始记录日志了。。。");
    }

    /**
     * 异常通知
     */
    @AfterThrowing("pt1()")
    public void afterThrowingPrintLog() {
        System.out.println("异常通知Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
    }

    /**
     * 最终通知
     */
    @After("pt1()")
    public void afterPrientLog() {
        System.out.println("最终通知Logger类中的afterPrintLog方法开始记录日志了。。。");
    }

    /**
     * 环绕通知
     * 问题：
     * 当我们配置了环绕通知之后，切入点方法没有执行，而通知方法执行了。
     * 分析：
     * 通过对比动态代理中的环绕通知代码，发现动态代理的环绕通知有明确的切入点方法调用，而我们的代码中没有。
     * 解决：
     * Spring框架为我们提供了一个接口：ProceedingJoinPoint。该接口有一个方法proceed()，此方法就相当于明确调用切入点方法。
     * 该接口可以作为环绕通知的方法参数，在程序执行时，spring框架会为我们提供该接口的实现类供我们使用。
     * <p>
     * spring中的环绕通知：
     * 它是spring框架为我们提供的一种可以在代码中手动控制增强方法何时执行的方式。
     */

    @Around("pt1()")
    public Object aroundPringLog(ProceedingJoinPoint pjp) {
        Object rtValue = null;

        try {

            Object[] args = pjp.getArgs();

            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。前置....环绕通知");

            rtValue = pjp.proceed(args);

            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。后置....环绕通知");

            return rtValue;

        } catch (Throwable throwable) {
            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。异常....环绕通知");

            throw new RuntimeException(throwable);
        } finally {
            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。最终....环绕通知");
        }


    }

}
