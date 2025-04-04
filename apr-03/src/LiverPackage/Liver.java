package LiverPackage;

public class Liver {
    String function;
    String condition;

    public Liver(String function, String condition) {
        this.function = function;
        this.condition = condition;
        System.out.println("LIVER DETAILS");
        System.out.println("----------------------");
    }

    public void showLiverInfo() {
        System.out.println("Function: " + this.function);
        System.out.println("Condition: " + this.condition);
    }
}
