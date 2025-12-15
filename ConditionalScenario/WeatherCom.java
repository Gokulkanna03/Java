import java.util.*;

public class WeatherCom{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int temp = obj.nextInt();

        if (temp >= 35) {
            System.out.println("Weather is Very Hot");
        } else if (temp >= 25) {
            System.out.println("Weather is Hot");
        } else if (temp >= 15) {
            System.out.println("Weather is Pleasant");
        } else if (temp >= 5) {
            System.out.println("Weather is Cold");
        } else {
            System.out.println("Weather is Very Cold");
        }

        
    }
}
