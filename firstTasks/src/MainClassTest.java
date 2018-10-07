import org.junit.Test;
import org.junit.Assert;

public class MainClassTest {

    @Test
    public void testGetClassNumber(){
        MainClass returnValue = new MainClass();
        Assert.assertTrue("Return value < 45",returnValue.getClassNumber()>45);
    }
}