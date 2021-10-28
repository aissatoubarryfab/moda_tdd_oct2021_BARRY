import org.junit.Assert;
import org.junit.Test;

public class DictionaryTest {
    Dictionary dict;
    @Test
    public void testDictionaryName() {
        Assert.assertEquals(dict.getName(), "Example");
    }
}
