import java.util.*;

public class Dictionary {

    private String name;

    private Map<String, String> translations;

    public Dictionary(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public boolean IsEmpty(){
        return true;
    }

    public void addTranslation(String T1,String T2) {
        translations = new HashMap();
        translations.put(T1,T2);
    }

    public String getTranslation(String c) {
        return this.translations.get(c);
    }
}
