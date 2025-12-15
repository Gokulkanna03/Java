import java.util.*;

public class Ticket {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter passenger age: ");
        int age = obj.nextInt();

        if (age <=12) {
            System.out.println(" Child");
            System.out.println(" Price: Rs.50");
        } else if (age <=60) {
            System.out.println(" Adult");
            System.out.println(" Price: Rs.100");
        } else {
            System.out.println(" Senior");
            System.out.println("Price: Rs.70");
        }

        
    }
}
