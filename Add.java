import java.util.Scanner;
public class Add {
    public static void main(String[]args) {
        int N1 = 0;
        int N2 = 0;
        int add = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        N1 = sc.nextInt();
        System.out.println("Enter Second Number");
        N2 = sc.nextInt();

        add=N1+N2;
        System.out.println("\nAddition of"+N1+"&"+N2+"is="+add);
    }
}
