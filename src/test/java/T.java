import org.junit.jupiter.api.Test;

public class T {
    @Test
    void t1(){
        String s ="null";
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 50000 ; i++){
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("===" + (end - start));
    }
    @Test
    void t2(){
        StringBuilder sb = new StringBuilder("null");
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 50000 ; i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("===" + (end - start));
    }


}
