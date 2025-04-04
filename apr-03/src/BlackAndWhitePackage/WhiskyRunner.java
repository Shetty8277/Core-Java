package BlackAndWhitePackage;

public class WhiskyRunner {
    public static void main(String[] args) {
        Whisky whisky = new Whisky("Black & White", 12);
        Bar bar = new Bar("Sky Lounge", whisky);
        bar.showDrink();
    }
}
