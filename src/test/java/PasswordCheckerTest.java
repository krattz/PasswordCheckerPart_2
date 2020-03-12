import org.junit.Assert;
import org.junit.Test;

public class PasswordCheckerTest {

    @Test
    public void TestPasswordIsValid(){
        String password = "!12DWEgjdjkbvks";
        Assert.assertEquals(password.isEmpty(), false);
        Assert.assertEquals(password.length()>8, true);
        Assert.assertEquals(password.matches(".*[a-z].*"), true);
        Assert.assertEquals(password.matches(".*[A-Z].*"), true);
        Assert.assertEquals(password.matches(".*[0-9].*"), true);
        Assert.assertEquals(password.matches("[!@#$%^*.,/:;?].*"), true);
    }
    @Test
    public void TestPasswordIsOk(){
        String password = "!12DWEgjdjkbvks";
        Assert.assertEquals((password.isEmpty()!=true) &&password.length()>8 && password.matches(".*[a-z].*"), true);
    }
    @Test
    public void TestPasswordIsNEverOk(){
        String password = "!12DWEgjdjkbvks";
        Assert.assertEquals((password.isEmpty()!=true) &&password.length()>8, true);
    }
}