import java.util.Scanner;
public class Studentdetails {
    public static void main(String[]args)
    {
        String Name="" , Course ="", City ="",
        RollNumber = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: "+"Ajay");
        Name = sc.nextLine();
        System.out.println("Enter  RollNumber: "+ 12345);
        RollNumber= sc.nextLine();
        System.out.println("Enter Course: "+"Computer Science");
        Course = sc.nextLine();
        System.out.println("Enter City: "+"Pune");
        City = sc.nextLine();

       
    }
}