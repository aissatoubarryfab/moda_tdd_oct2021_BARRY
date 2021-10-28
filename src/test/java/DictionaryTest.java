
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DictionaryTest {
    Dictionary dict;

    @Test
    public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }

    @BeforeEach
    void setUpClass()
    {
        this.dict =new Dictionary("Example");
    }

    @Test
    public void IsEmpty(){
        assertTrue(dict.IsEmpty());
    }

    @Test
    public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"), equalTo("Bonjour"));
    }


}
