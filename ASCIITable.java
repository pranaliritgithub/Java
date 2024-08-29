public class ASCIITable {
    public static void main(String[] args) {
        System.out.println("ASCII Table(0-127):");
        System.out.println("----------------------");
        System.out.println("Decimal | Character ");
        System.out.println("----------------------");

        for(int i=0; i<=127; i++){
            System.out.printf("%-9d|  %c%n", i, (char) i);
        }
        System.out.println("----------------------");
    }
}

