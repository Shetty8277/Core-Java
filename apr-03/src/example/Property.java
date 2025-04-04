package example;

import java.util.Arrays;

public class Property {
    private final String name;
    private final String dimensions;
    private final String[] totalproperty;

    public Property(String name,String dimensions,String[] totalproperty){
        this.name =name;
        this.dimensions = dimensions;
        this.totalproperty =totalproperty;

    }
    public void display(){
        System.out.println("Name of the Property "+name);
        System.out.println("Name of the Property "+dimensions);
        System.out.println("Name of the Property "+ Arrays.toString(totalproperty));

    }
}
