import java.util.*;

public class NumVa {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobile = obj.next();   
        if (mobile.length() == 10) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }

       
    }
}
