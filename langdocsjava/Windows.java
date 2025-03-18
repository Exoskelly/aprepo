public class Windows extends Computer {
    private double version;

    public Windows(String name, int number, double value, double version) {
        super(name, number, value);
        this.version = version;
    }

    public double getVersion() {
        return version;
    }
}
