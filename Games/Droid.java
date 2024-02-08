package Games;

public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName) {

        batteryLevel = 100;
        name = droidName;
    }

    public void performTask(String task) {
        //codey.performTask("Singing");
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public String toString() {
        return "Hello, I’m the droid:" + name;
    }

    public static void main(String[] args) {

        Droid codey = new Droid("Codey");
        System.out.println(codey);
        //Performing Task
        codey.performTask("dancing");
        codey.performTask("coding");



    }

}