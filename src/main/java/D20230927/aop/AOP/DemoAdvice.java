package D20230927.aop.AOP;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoAdvice {
    private long startTime;
    private long endTime;
    @Pointcut("execution(void D20230927.aop.dao.imp.UserDaoImp.*())")
    private void pt() {
    }
    @Before("pt()")
    public void startTimeSetBefore(){
        startTime = System.currentTimeMillis();
        System.out.println("startTime=" + startTime);
    }


    @Pointcut("execution(void D20230927.aop.dao.imp.UserDaoImp.destroy())")
    private void pts() {
    }
    @After("pts()")
    public void endTimeSetAfter(){
        endTime = System.currentTimeMillis();
        System.out.println("endTime=" + endTime);
        System.out.println("elapasedTime=" + (startTime - endTime));
    }

}
