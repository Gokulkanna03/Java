import java.util.Scanner;

public class PerimeterTriangle {
     public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the side 1:");
        double a=obj.nextDouble();
         System.out.println("Enter the side 2:");
        double b=obj.nextDouble();
         System.out.println("Enter the side 3:");
        double c=obj.nextDouble();
        double Perimeter=a+b+c;
        System.out.println("The perimeter of the Rectangle: "+Perimeter);
    
}
}