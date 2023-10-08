import org.junit.jupiter.api.Test;

public class StringVsStringBuilderTest {
    @Test
    @Disable
    @DisplayName("Disable用来让当前Test不进行")
    void StringTest(){
        String s ="null";
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 50000 ; i++){
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("===" + (end - start));
    }
    @Test
    void StringBuilderTest(){
        StringBuilder sb = new StringBuilder("null");
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 50000 ; i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("===" + (end - start));
    }


}
