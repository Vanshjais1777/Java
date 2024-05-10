package Transport;

public class Car extends vehcile {
    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAC() {
        System.out.println("AC started of " + name);
    }
}
