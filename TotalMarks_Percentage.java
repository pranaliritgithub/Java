import java.io.*;
import java.util.Scanner;

public class TotalMarks_Percentage {
    public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);

      int Subject1, Subject2, Subject3;

      System.out.println("Enter Marks for Subject 1: ");
      Subject1 = sc.nextInt();

        System.out.println("Enter Marks for Subject 2: ");
        Subject2 = sc.nextInt();

        System.out.println("Enter Marks for Subject 3: ");
        Subject3 = sc.nextInt();

        int Total = Subject1 + Subject2 + Subject3;

        float percentage = (Total*100/300);

        System.out.println("Total Marks: " + Total);
        System.out.println("percentage: " + percentage + "%");
    }
}
