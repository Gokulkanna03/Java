import java.util.*;

public class SpeedLimit {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter vehicle speed km/h:");
        int speed = obj.nextInt();

        if (speed >=100) {
            System.out.println("Over-speeding! Fine imposed");
        } else {
            System.out.println("Speed is within limit");
        }
    }
}
