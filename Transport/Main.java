package Transport;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Maruti", "800", 4, 5, "Auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();
    }
}