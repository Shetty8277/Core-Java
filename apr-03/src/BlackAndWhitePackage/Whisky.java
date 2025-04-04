package BlackAndWhitePackage;

public class Whisky {
    String brand;
    int age;

    public Whisky(String brand, int age) {
        this.brand = brand;
        this.age = age;
        System.out.println("THE WHISKY DETAILS ARE");
        System.out.println("------------------------");
    }

    public void whiskyDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Aged: " + this.age + " years");
    }
}
