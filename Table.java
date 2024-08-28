import java.util.*;
public class Table {
    public static void main(String[]args)
    {
        int No = 0, i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter a Number:");
        No = sc.nextInt();

        i = 1;

        while(i<=10)
        {
            System.out.println(" " + No + " * " + i + " = " + No * i);
            i++;
        }
        System.out.println("\n No = " + No + "\n i = " + i);

    }
}
