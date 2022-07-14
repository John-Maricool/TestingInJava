package array2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitTest {
    @Test
    public void testCase(){
        System.out.println("First test");
        String str = "First test";
        assertEquals("First test", str);
    }
}
