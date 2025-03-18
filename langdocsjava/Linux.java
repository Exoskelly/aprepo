public class Linux extends Computer {
    private int secretCode;

    public Linux(String name, int number, double value, int secretCode) {
        super(name, number, value);
        this.secretCode = secretCode;
    }

    public int getSecretCode() {
        return secretCode;
    }
}
