
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

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

}
