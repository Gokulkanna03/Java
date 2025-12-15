import java.util.*;

public class ElectricBill {
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);
        System.out.print("Enter Units : ");
        int units = obj.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = 0;
        } 
        else if (units <= 300) {
            bill = (units - 100) * 5;
        } 
        else {
            bill = (200 * 5) + (units - 300) * 10;
        }

        if (units > 500) {
            bill = bill + (bill * 0.10); 
        }

        System.out.println("Total Electricity Bill: " + bill);
    }
}
