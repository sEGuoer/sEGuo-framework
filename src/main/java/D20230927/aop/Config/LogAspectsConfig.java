package D20230927.aop.Config;


import D20230927.aop.AOP.LogAspects;
import D20230927.aop.AOP.MathCalculator;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAspectJAutoProxy
@Import({LogAspects.class, MathCalculator.class})
public class LogAspectsConfig {

}
