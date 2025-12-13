import java.util.Scanner;

public class VolumeCube {
     public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the length:");
        double length=obj.nextDouble();
         System.out.println("Enter the width:");
        double width=obj.nextDouble();
        System.out.println("Enter the height:");
        double height=obj.nextDouble();
        double SurfaceArea=2*(length*width+width*height+height*length);
        double volume=length*width*height;
        System.out.println("The Volume of the cuboid: "+volume);
        System.out.println("The Surfacearea of the cuboid: "+SurfaceArea);
    
}
}