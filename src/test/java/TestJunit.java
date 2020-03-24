import org.junit.Assert;
import org.junit.Test;

public class TestJunit {
    @Test
    public void testCase1() {
        Assert.assertEquals(6, Calculator.plus(1, 5),0);
    }
}
