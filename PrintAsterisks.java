import java.util.Scanner;
public class PrintAsterisks {
    public static void main(String[]args){

        int num = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Asterisks to print:");
        num = sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            System.out.println("*");
        }
    }
}
