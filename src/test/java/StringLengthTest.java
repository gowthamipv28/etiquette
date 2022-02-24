import org.testng.Assert;
import org.testng.annotations.Test;

public class StringLengthTest {
    @Test
    public void shouldGetLengthOfAString() {
        String testString = "Gowthami TestVagrant";
        Assert.assertEquals(testString.length(),20);
    }
}
