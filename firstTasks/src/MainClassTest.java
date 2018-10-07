import org.junit.Test;
import org.junit.Assert;

public class MainClassTest {

    @Test
    public void testGetClassString(){
        String returnValue = new MainClass().getClassString();
        boolean result = returnValue.contains("Hello") || returnValue.contains("hello");
        Assert.assertTrue("String does not contain 'Hello' or 'hello'", result);
    }
}