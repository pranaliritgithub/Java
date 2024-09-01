import java.util.Scanner;
public class Factorsindecreasingorder {
    public static void main(String[]args){
       
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a number:");
         int number = sc.nextInt();

         System.out.println("Factors of " + number + " in decreasing order: ");


        for(int i = number; i >= 1; i--){

            if(number % i == 0){
            System.out.println(i + " ");

        
    }
    
}
    }
}
