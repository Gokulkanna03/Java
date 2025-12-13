import java.util.Scanner;

public class AllCube {
     public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the side:");
        double a=obj.nextDouble();
        double SurfaceArea=6*a*a;
        System.out.println("The surface area of the cube is:"+SurfaceArea);
        double volume=a*a*a;
        System.out.println("The volume of the cube is:"+volume);
        double perimeter=4*a;
        System.out.println("The perimeter of the Square: "+perimeter);
    
}
}