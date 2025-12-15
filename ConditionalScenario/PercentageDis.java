import java.util.*;

public class PercentageDis {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print(" purchase amount: ");
        double amount = obj.nextDouble();

        double discount = 0;

        if (amount >= 5000) {
            discount = amount * 0.20;
        } else if (amount >= 3000) {
            discount = amount * 0.15;
        } else if (amount >= 1000) {
            discount = amount * 0.10;
        } else {
            discount = 0;
        }

        double finalAmount = amount - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Final Amount to pay: " + finalAmount);

        
    }
}
