package main.com.pwq;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author：WenqiangPu
 * @Description
 * @Date：Created in 11:41 2017/9/1
 * @Modified By：
 */
@Component
@Aspect
public class Advices {
    @Pointcut("execution(* main.com.pwq.Math.*(..))")
    public void pointcut1(){

    }
    @Before("pointcut1()")
    public void before(JoinPoint jp){
        System.out.println("----------前置通知----------");
        System.out.println(jp.getSignature().getName());
        System.out.println("dev的修改");

    }
//    @After("execution(* main.com.pwq.*.*(..))")
//    @After("within(main.com.pwq.*)")
//    @After("this(main.com.pwq.Imath)")
//    @After("args(int,int)")
//    @After("@annotation()")
    @After("pointcut1()")
    public void after(JoinPoint jp){
        System.out.println("----------最终通知----------");
    }
    @Around("execution(* main.com.pwq.Math.a*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(pjp.getSignature().getName());
        System.out.println("----------环绕前置----------");
        Object result=pjp.proceed();
        System.out.println("----------环绕后置----------");
        return result;
    }

    @AfterReturning(pointcut = "execution(* main.com.pwq.Math.s*(..))",returning = "result")//拿到返回结果
    public void afterReturning(JoinPoint jp,Object result){
        System.out.println(jp.getSignature().getName());
        System.out.println("结果是 =  "+result);
        System.out.println("----------返回结果----------");
    }
    //异常后通知
    @AfterThrowing(pointcut="execution(* main.com.pwq.Math.d*(..))",throwing="exp")
    public void afterThrowing(JoinPoint jp,Exception exp){
        System.out.println(jp.getSignature().getName());
        System.out.println("异常消息："+exp.getMessage());
        System.out.println("----------异常通知----------");
    }
}
