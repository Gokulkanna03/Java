import java.util.*;

class WeekendSwitch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = obj.nextInt();

        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a Weekday.");
             break;
            case 6:
            case 7:
                System.out.println("It is a Weekend.");
                break;
            default:
                System.out.println("Invalid day ");
        }
    }
}
