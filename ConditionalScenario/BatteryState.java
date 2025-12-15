import java.util.*;

public class BatteryState{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int battery = obj.nextInt();

        if (battery >= 80) {
            System.out.println("Battery Full");
        } else if (battery >= 21) {
            System.out.println("Battery Moderate");
        } else {
            System.out.println("Battery Low");
        }

    }
}
