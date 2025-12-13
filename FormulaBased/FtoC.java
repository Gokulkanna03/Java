import java.util.*;
public class FtoC {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Fahrenheit temperature:");
        double Fah=obj.nextDouble();
        double celsius=(Fah-32)*5/9;
        System.out.println("The temperature in celsius is:"+celsius);
    }
}
