package Collection.dictionary;

public class Dictionary {
    private String en;
    private String uz;
    private String ru;

    public Dictionary(String en, String uz, String ru) {
        this.en = en;
        this.uz = uz;
        this.ru = ru;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getUz() {
        return uz;
    }

    public void setUz(String uz) {
        this.uz = uz;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "en='" + en + '\'' +
                ", uz='" + uz + '\'' +
                ", ru='" + ru + '\'' +
                '}';
    }
}
