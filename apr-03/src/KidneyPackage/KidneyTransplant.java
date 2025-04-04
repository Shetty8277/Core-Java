package KidneyPackage;

public class KidneyTransplant {
    Kidney kidney;
    String hospitalName;

    public KidneyTransplant(String hospitalName, Kidney kidney) {
        this.kidney = kidney;
        this.hospitalName = hospitalName;
    }

    public void displayTransplantInfo() {
        if (kidney != null) {
            kidney.showDetails();
        } else {
            System.err.println("Kidney instance is null");
        }
        System.out.println("Hospital Name: " + this.hospitalName);
    }
}
