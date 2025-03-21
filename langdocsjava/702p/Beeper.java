public class Beeper extends Animal {
    private String myWord;
    public Beeper(String name, String spWord) {
        super(name);
        myWord = spWord;
    }
    public String getSpWord() {
        return myWord;
    }
}
