public class Electronics {

    String brand;
    String model;
    String type;
    double price;
    boolean isSmartDevice;
    double batteryLife;
    String processor;
    int storageCapacity;
    boolean hasWarranty;
    String connectivityType;

    Electronics() {
        System.out.println("Default constructor");
    }

    Electronics(String brand) {
        this();
        this.brand = brand;
    }

    Electronics(String brand, String model, String type, double price) {
        this(brand);
        this.model = model;
        this.type = type;
        this.price = price;
    }

    Electronics(String brand, String model, String type, double price, boolean isSmartDevice, double batteryLife, String processor) {
        this(brand, model, type, price);
        this.isSmartDevice = isSmartDevice;
        this.batteryLife = batteryLife;
        this.processor = processor;
    }

    Electronics(String brand, String model, String type, double price, boolean isSmartDevice, double batteryLife, String processor, int storageCapacity, boolean hasWarranty, String connectivityType) {
        this(brand, model, type, price, isSmartDevice, batteryLife, processor);
        this.storageCapacity = storageCapacity;
        this.hasWarranty = hasWarranty;
        this.connectivityType = connectivityType;
    }

    public void displayInfo() {
        System.out.println("Electronics Information");
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Type: " + this.type);
        System.out.println("Price: $" + this.price);
        System.out.println("Smart Device: " + this.isSmartDevice);
        System.out.println("Battery Life: " + this.batteryLife);
        System.out.println("Processor: " + this.processor);
        System.out.println("Storage Capacity: " + this.storageCapacity );
        System.out.println("Has Warranty: " + (this.hasWarranty ? "Yes" : "No"));
        System.out.println("Connectivity Type: " + this.connectivityType);
    }

    public static void main(String[] args) {
        Electronics electronic = new Electronics("Samsung", "Galaxy S21", "Smartphone", 799.99, true, 24.0, "Snapdragon 888", 128, true, "Wi-Fi & 5G");
        electronic.displayInfo();
    }
}
