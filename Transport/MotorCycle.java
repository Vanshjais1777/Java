package Transport;

public class MotorCycle extends vehcile {
    public String handleBarStyle;
    public String suspensionType;

    MotorCycle(String name, String model, int noOfTyres, String handleBarType, String suspensionType){
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarType;
        this.suspensionType = suspensionType;
    }

    public void wheelie(){
        System.out.println("Motor cycle is doing Wheelieeeeee!" + name);
    }
}
