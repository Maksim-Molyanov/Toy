public class Toy{
    int ID;
    String name;
    double frequency;

    public Toy(int ID, String name, double frequency) {
        this.ID = ID;
        this.name = name;
        this.frequency = frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "ID = " + ID + ", название = " + name + ", частота выпадения = " + frequency + "";
    }
}