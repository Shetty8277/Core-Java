package LiverPackage;

public class LiverCheckup {
    Liver liver;
    String doctorName;

    public LiverCheckup(String doctorName, Liver liver) {
        this.liver = liver;
        this.doctorName = doctorName;
    }

    public void displayCheckup() {
        if (liver != null) {
            liver.showLiverInfo();
        } else {
            System.err.println("Liver instance is null");
        }
        System.out.println("Doctor Name: " + this.doctorName);
    }
}
