import org.junit.Test;
import org.junit.Assert;

public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
        MainClass returnValue = new MainClass();
        Assert.assertTrue("Return value !=14",returnValue.getLocalNumber()==14);
    }
}
