import java.util.Scanner;

public class PerimeterSquare {
     public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the side:");
        double a=obj.nextDouble();
        double b=4*a;
        System.out.println("The perimeter of the Square: "+b);
    
}
}