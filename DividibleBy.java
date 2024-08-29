import java.util.*;
public class DividibleBy {
    public static void main(String[]args){
       
        int No=0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The No: ");
        No = sc.nextInt();

        if(No % 7 == 0){
        System.out.println(+ No +"is divisible by 7");
        }
        
        else{
            System.out.println(+ No + " is not divisible by 7");
        }
    }
}   




    

