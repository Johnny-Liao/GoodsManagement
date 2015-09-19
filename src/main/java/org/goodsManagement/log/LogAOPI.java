package org.goodsManagement.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by never on 2015/9/8.
 */
public interface LogAOPI {

    /**
     * Before
     * 在核心业务执行前执行，不能阻止核心业务的调用。
     * <p>
     * 无参的日志方法
     * <p>
     * 此处意在执行核心业务逻辑前，做一些安全性的判断等等
     * 可通过joinPoint来获取所需要的内容
     *
     * @param point
     */
    void beforeAdvice(JoinPoint point);

    /**
     * After
     * 核心业务逻辑退出后（包括正常执行结束和异常退出），执行此Advice
     * <p>
     * 有参的日志方法
     * <p>
     * 此处意在执行核心业务逻辑之后，做一些日志记录操作等等
     * 可通过joinPoint来获取所需要的内容
     *
     * @param point
     */
    void afterAdvice(JoinPoint point);

    /**
     * Around
     * 手动控制调用核心业务逻辑，以及调用前和调用后的处理,
     * <p>
     * 注意：当核心业务抛异常后，立即退出，转向AfterAdvice
     * 执行完AfterAdvice，再转到ThrowingAdvice
     *
     * @param pjp
     * @return
     * @throws Throwable
     */
    Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable;


    /**
     * AfterReturning
     * 核心业务逻辑调用正常退出后，不管是否有返回值，正常退出后，均执行此Advice
     * <p>
     * 有参有返回值的方法
     * <p>
     * 此处可以对返回值做进一步处理
     * 可通过joinPoint来获取所需要的内容
     *
     * @param point
     * @param returnObj
     */
    void afterReturningAdvice(JoinPoint point, Object returnObj);

    /**
     * 核心业务逻辑调用异常退出后，执行此Advice，处理错误信息
     * <p>
     * 注意：执行顺序在Around Advice之后
     * <p>
     * 此处意在执行核心业务逻辑出错时，捕获异常，并可做一些日志记录操作等等
     * 可通过joinPoint来获取所需要的内容
     *
     * @param joinPoint
     * @param ex
     */
    void afterThrowingAdvice(JoinPoint joinPoint, Exception ex);
}
