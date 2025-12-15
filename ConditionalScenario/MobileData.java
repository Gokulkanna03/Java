import java.util.*;

public class MobileData {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter data per day in gb: ");
        double totalData = obj.nextDouble();

        System.out.print("Enter used data in gb: ");
        double usedData = obj.nextDouble();

        double used = (usedData / totalData) * 100;

        if (used < 50) {
            System.out.println("Low Data");
        } 
        else if (used == 50) {
            System.out.println("Half Consumed");
        } 
        else if (used> 100) {
            System.out.println("Data Over");
        } 
        else {
            System.out.println("Data Usage Normal");
        }
    }
}

