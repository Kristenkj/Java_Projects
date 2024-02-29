package src.oops.Abstraction.interfaces.realtimeexampleelsewewillwantrefund;

public class Car implements Engine, Break {
    void start(){
        System.out.println("Starting the car");
        startEngine();
        breaks();

    }

    @Override
    public void startEngine() {
        System.out.println("Started Engine");

    }

    @Override
    public void breaks() {
        System.out.println("Breaks are working fine");
    }
}
