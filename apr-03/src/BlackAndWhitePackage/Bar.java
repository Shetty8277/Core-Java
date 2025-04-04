package BlackAndWhitePackage;

public class Bar {
    Whisky whisky;
    String barName;

    public Bar(String barName, Whisky whisky) {
        this.barName = barName;
        this.whisky = whisky;
    }

    public void showDrink() {
        if (whisky != null) {
            whisky.whiskyDetails();
        } else {
            System.err.println("Whisky instance is null");
        }
        System.out.println("Bar Name: " + this.barName);
    }
}
