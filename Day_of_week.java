import java.util.*;
public class Day_of_week {
    public static void main(String[]args){

        int Day = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter Day Number(1-7):");
        Day = sc.nextInt();

        if(Day <=0 || Day > 7) {
            System.out.println("Invalid Day Number:");
        }

        else if(Day == 1)
        {
                System.out.println("\n Monday");
            }
        else if(Day == 2)
        {
            System.out.println("\n Tuesday");
        }
        else if(Day == 3)
        {
            System.out.println("\n Wednsday");
        }
        else if(Day == 4)
        {
            System.out.println("\n Thursday");
        }
        else if(Day == 5)
        {
            System.out.println("\n Friday");
        }
        else if(Day == 6)
        {
            System.out.println("\n saturday");
        }
        else if(Day == 7)
        {
            System.out.println("\n Sunday");
        }

        System.out.println("\n Thanks");

        }

    }


    

