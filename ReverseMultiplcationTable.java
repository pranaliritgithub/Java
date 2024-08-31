import java.util.Scanner;
public class ReverseMultiplcationTable {
    public static void main(String[]args){

        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print reversemultiplication table: ");
        num = sc.nextInt();

        for( int i=10;i>=1;i--)
        {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
