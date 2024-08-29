import java.util.*;
public class Month_Of_Year 
{
    public static void main(String[]args){
        int Number = 12;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        Number = sc.nextInt();

        String NumberString="";

       switch(Number){
        
        case 1:
        NumberString="January";
        break;
        case 2:
        NumberString="February";
        break;
        case 3:
        NumberString="March";
        break;
        case 4:
        NumberString="April";
        break;
        case 5:
        NumberString="May";
        break;
        case 6:
        NumberString="June";
        break;
        case 7:
        NumberString="July";
        break;
        case 8:
        NumberString="Augst";
        break;
        case 9:
        NumberString="September";
        break;
        case 10:
        NumberString="October";
        break;
        case 11:
        NumberString="November";
        break;
        case 12:
        NumberString="December";
        break;
        }
        System.out.println(NumberString);
        }
    }
    




    

