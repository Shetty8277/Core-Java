package LiverPackage;

public class LiverRunner {
    public static void main(String[] args) {
        Liver liver = new Liver("Detoxification", "Healthy");
        LiverCheckup checkup = new LiverCheckup("Dr. Sharma", liver);
        checkup.displayCheckup();
    }
}
