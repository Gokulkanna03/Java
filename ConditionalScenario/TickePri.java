import java.util.*;

public class TickePri {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String day = obj.next();

        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend  Price: Rs.150");
        } else {
            System.out.println("Weekday  Price: Rs.100");
        }

    }
}
