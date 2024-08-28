import java.util.*;
public class Print_Day
{
    public static void main(String[]args)
    {
        int Day = 0;
        String dayString;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter Day Number:");
        Day = sc.nextInt();

        switch(Day)
        {
            case 1:
                dayString = "Monday";
                break;

            case 2:
                dayString = "Tuesday";
                break;

            case 3:
                dayString = "Wednsday";
                break;

            case 4:
                dayString = "Thursday";
                break;

            case 5:
                dayString = "Friday";
                break;

            case 6:
                dayString = "Saturday";
                break;

            case 7:
                dayString = "Sunday";
                break;

            default:
                dayString = "Invalid Day";
        }
        System.out.println(dayString);


    }
}
