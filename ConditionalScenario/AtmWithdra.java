import java.util.*;

public class AtmWithdra {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        double balance = 5000;  

        System.out.print("Enter withdrawal amount: ");
        int amount = obj.nextInt();

        if (amount <= balance && amount % 100 == 0) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: " + balance);
        } 
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } 
        else {
            System.out.println("Withdrawal amount is multiple of 100");
        }
    }
}
