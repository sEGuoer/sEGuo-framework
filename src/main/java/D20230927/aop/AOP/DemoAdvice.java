package D20230927.aop.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoAdvice {
    @Pointcut("execution(void D20230927.aop.dao.imp.UserDaoImp.*())")
    private void pt() {
    }
    @Before("pt()")
    public void startTimeSetBefore(){
        long startTime = System.currentTimeMillis();
        System.out.println("startTime=" + startTime);
    }


    @Pointcut("execution(void D20230927.aop.dao.imp.UserDaoImp.destroy())")
    private void pts() {
    }
    @After("pts()")
    public void endTimeSetAfter(){
        long endTime = System.currentTimeMillis();
        System.out.println("endTime=" + endTime);
    }


    @Pointcut("execution(void D20230927.aop.dao.imp.UserDaoImp.destroy())")
    public void ptsm() {
    }
    @Around("ptsm()")
    public void elapasedTimeSout(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        
        joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

}
