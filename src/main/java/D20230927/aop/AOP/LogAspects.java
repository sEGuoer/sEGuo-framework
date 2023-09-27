package D20230927.aop.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.dao.DataAccessException;

@Aspect
public class LogAspects {
    @Pointcut("execution(int D20230927.aop.AOP.MathCalculator.getMath(..))")
    private void pt() {
    }
    @Before("pt()")
    public void before(JoinPoint joinPoint){
        System.out.println("before:"+joinPoint.getSignature().getDeclaringTypeName());
    }
    @After("pt()")
    public void After(JoinPoint joinPoint){
        System.out.println("After:"+joinPoint.getSignature().getDeclaringTypeName());
    }
    @AfterReturning("pt()")
    public void AfterReturning(JoinPoint joinPoint){
        System.out.println("AfterReturning:"+joinPoint.getSignature().getDeclaringTypeName());

    }
    @AfterThrowing(value = "pt()", throwing = "throwable")
    public void AfterThrowing(JoinPoint joinPoint,Throwable throwable){
        System.out.println("AfterThrowing:"+joinPoint.getSignature().getDeclaringTypeName()+System.lineSeparator() + "throwError:"+throwable);
    }
}
