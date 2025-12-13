import java.util.*;
public class CtoF {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Fahrenheit temperature:");
        double cel=obj.nextDouble();
        double Fahrenheit=(cel*9/5)+32;
        System.out.println("The temperature in celsius is:"+Fahrenheit);
    }
}
