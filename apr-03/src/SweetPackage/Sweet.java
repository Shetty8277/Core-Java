package SweetPackage;

public class Sweet {
    String name;
    String origin;

    public Sweet(String name, String origin) {
        this.name = name;
        this.origin = origin;
        System.out.println("SWEET DETAILS");
        System.out.println("----------------------");
    }

    public void sweetInfo() {
        System.out.println("Sweet Name: " + this.name);
        System.out.println("Origin: " + this.origin);
    }
}
