import java.util.*;
public class MaxFromTwo {
    public static void main(String[]args)
    {
        int N1 = 0, N2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter First Number:");
        N1 = sc.nextInt();
        System.out.println("\n Enter Second Number:");
        N2 = sc. nextInt();

        if(N1 == N2)
        {
            System.out.println("\n Both Number are Equal.");
        }
        else if(N1>N2)
        {
            System.out.println("\n Number" +N1+" is Maximum.");
        }
        else
        {
            System.out.println("\n Number" +N2+" is Maximum.");

        }
        System.out.println("\n Thanks");
    }
}