import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[]args){

        int Num1 = 223;
        int Num2 = 112;
        int Num3 = 415;

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter First Number:");
       Num1 = sc.nextInt();

       System.out.println("Enter Second Number:");
       Num2 = sc.nextInt();

       System.out.println("Enter Third Number:");
       Num3 = sc.nextInt();

       if(Num1>Num2)
       {
        if(Num1>Num3)
        {
       
       System.out.println("The greater number is" +Num1);
       }
       else{
        System.out.println("The greater number is" +Num3);
       }
    }
    else
    {
        if(Num2>Num3)
        {
            System.out.println("The greater number is" +Num2);

    }
    else{
        System.out.println("The greater number is" +Num3);
    }
}
    }
}


   
      
    
    
    

       
       

    
    

