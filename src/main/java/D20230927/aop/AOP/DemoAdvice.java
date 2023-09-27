package D20230927.aop.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
}
