import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[]args){

        int sum = 0;

        Scanner sc = new Scanner(System.in);    

        System.out.println("Enter numbers to sum them up(enter zero or a negative number to stop):");

        while(true)
        {
            System.out.print("Enter a number:");
            int num = sc.nextInt();

            if(num <= 0)
            {
                break;
            }
            System.out.println("The sum of the entered number is: " +sum);
        }
    }
    
}
