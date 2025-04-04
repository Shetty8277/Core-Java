package KidneyPackage;

public class Kidney {
    String bloodType;
    int healthPercentage;

    public Kidney(String bloodType, int healthPercentage) {
        this.bloodType = bloodType;
        this.healthPercentage = healthPercentage;
        System.out.println("KIDNEY DETAILS");
        System.out.println("----------------------");
    }

    public void showDetails() {
        System.out.println("Blood Type: " + this.bloodType);
        System.out.println("Health Percentage: " + this.healthPercentage + "%");
    }
}
