package UmbrellaPackage;

public class Umbrella {
    String color;
    String material;

    public Umbrella(String color, String material) {
        this.color = color;
        this.material = material;
        System.out.println("UMBRELLA DETAILS");
        System.out.println("----------------------");
    }

    public void showDetails() {
        System.out.println("Color: " + this.color);
        System.out.println("Material: " + this.material);
    }
}
