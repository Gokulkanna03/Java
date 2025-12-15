import java.util.*;

public class TrafficLight {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Traffic  Color : ");
        String color = obj.next();

        if (color.equalsIgnoreCase("Red")) {
            System.out.println("Stop");
        } 
        else if (color.equalsIgnoreCase("Yellow")) {
            System.out.println("Ready");
        } 
        else if (color.equalsIgnoreCase("Green")) {
            System.out.println("Go");
        } 
        else {
            System.out.println("Invalid Color");
        }
    }
}

