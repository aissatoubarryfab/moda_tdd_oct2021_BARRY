import java.util.*;

public class Dictionary {

    private String name;

    private Map<String, List<String>> translations;

    public Dictionary(String n) {
        this.name = n;
        translations = new HashMap();
    }

    public String getName() {
        return this.name;
    }

    public boolean IsEmpty(){
        return translations.isEmpty();
    }

    public void addTranslation(String T1,List<String> e) {
        translations.put(T1,e);
    }

    public List<String> getTranslation(String c) {
        return this.translations.get(c);
    }
}
