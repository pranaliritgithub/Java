import java.util.*;
public class DistanceinMeter {
    public static void main(String[]args){

        float m , km;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The kilometer:");
        km = input.nextFloat();

        m = km*1000;



        System.out.println("kilometer :" +km);
        System.out.println("meter :" +m);
    }
}