package GoldPackage;

public class Gold {
    String weight;
    String origin;

    public Gold( String weight,String origin){
        this.weight = weight;
        this.origin = origin;
        System.out.println("THE GOLD DETAILS ARE");
        System.out.println("----------------------");
    }

    public void carot(){
        System.out.println("The gold is 24 carot");
        System.out.println("The gold Details of the weight is  "+this.weight);
        System.out.println("The gold Details of the Origin "+this.origin);


    }

}
