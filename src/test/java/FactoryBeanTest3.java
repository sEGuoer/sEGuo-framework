import com.sEGuo.atValue.ValueBean;
import com.sEGuo.atValue.ValueBeanConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FactoryBeanTest3 {
    static final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @BeforeAll
    static void beforeAll(){
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);
    }
    @Test
    @DisplayName("@PropertySource@Value来用配置文件给class的state赋值")
    void FactoryBeanConfigTest3() throws Exception {
        Assertions.assertEquals("",out.toString());
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ValueBeanConfig.class);
        ValueBean valueBean = (ValueBean)ac.getBean(ValueBean.class);
        Assertions.assertEquals("ValueBean{text='haha', description='${valueBean.description}', math=2}",valueBean.toString());

    }
}
