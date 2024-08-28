import java.util.*;
public class Table01 {

        public static void main(String[]args)
        {
            int No = 0, i = 0;
            Scanner sc = new Scanner(System.in);

            System.out.println("\n Enter a Number:");
            No = sc.nextInt();



          for(i = 1 ; i <= 10 ; i++)
            {
                System.out.println(" " + No + " * " + i + " = " + No * i);

            }
            System.out.println("\n No = " + No + "\n i = " + i);

        }
    }
