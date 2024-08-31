import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[]args){

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");

        for(int i = 0;i<=10;i++)
        {
            System.out.println("Enter number" + i + ":"); 
            int number = sc.nextInt();
            
            sum +=number;
        }
         System.out.println("The sum of 10 number is" + sum);

        
    
}
    }


