package fauna;

public class Crocodile extends Animal {
    private double length;

    public Crocodile() {
        super();
    }

    public Crocodile(String name, int age, double length) {
        super(name, age);
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void sound() {
        System.out.print(" Sound: Rrrr!");
    }
}
