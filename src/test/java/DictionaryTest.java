
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
        dict.addTranslation("contre", List.of("against"));
        assertThat(dict.getMultipleTranslations("contre"), equalTo(List.of("against")));
    }

    @Test
    public void testManyTranslation() {
        dict.addTranslation("contre", List.of("Aissatou","Aniesse","Emma"));
        assertThat(dict.getMultipleTranslations("contre"), containsInAnyOrder("Emma","Aissatou","Aniesse"));
    }

    @Test
    public void testTraductionInverse(){
        dict.addTranslation("contre", List.of("Aissatou","Aniesse","Emma"));
        assertThat(dict.getKey(List.of("Aissatou","Aniesse","Emma")), equalTo("contre"));
    }

}
