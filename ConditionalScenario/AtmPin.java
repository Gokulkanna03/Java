import java.util.*;

public class AtmPin {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int Storpin = 3010;   
        System.out.print("Enter ATM PIN: ");
        int enterdpin = obj.nextInt();

        if (enterdpin == Storpin) {
            System.out.println("PIN Matched");
            System.out.println("You can process with withdrawal");
        } else {
            System.out.println("Incorrect PIN");
            System.out.println("Wrong Pin");
        }
    }
}
