import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){

        int i,fact=1;
        int number = 5;

        Scanner sc = new Scanner(System.in);

        for(i=1;i<=number;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of " +number+ " is: " +fact);
    }
    
}
