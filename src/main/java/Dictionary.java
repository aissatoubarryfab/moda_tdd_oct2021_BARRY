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

    public boolean IsEmpty() {
        return translations.isEmpty();
    }

    public void addTranslation(String T1, List<String> e) {
        translations.put(T1, e);
    }

    public List<String> getMultipleTranslations(String c) {
        return this.translations.get(c);
    }

    public String getKey(List<String> g) {

        for (Map.Entry<String, List<String>> elem : this.translations.entrySet()) {
            if (Objects.equals(g, elem.getValue())) {
                return elem.getKey().toString();

            }
        }
        return null;
    }
}