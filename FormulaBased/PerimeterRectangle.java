import java.util.Scanner;

public class PerimeterRectangle {
     public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the length:");
        double length=obj.nextDouble();
         System.out.println("Enter the length:");
        double breath=obj.nextDouble();
        double Perimeter=2*(length+breath);
        System.out.println("The perimeter of the Rectangle: "+Perimeter);
    
}
}