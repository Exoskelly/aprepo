public abstract class Computer implements comps {
    protected String name;
    protected int number;
    protected double value;

    public Computer(String name, int number, double value) {
        this.name = name;
        this.number = number;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getValue() {
        return value;
    }
}
