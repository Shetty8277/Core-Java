package KidneyPackage;

public class KidneyRunner {
    public static void main(String[] args) {
        Kidney kidney = new Kidney("O+", 90);
        KidneyTransplant transplant = new KidneyTransplant("Apollo Hospital", kidney);
        transplant.displayTransplantInfo();
    }
}
