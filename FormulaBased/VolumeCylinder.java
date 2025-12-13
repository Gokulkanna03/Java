import java.util.Scanner;

public class VolumeCylinder{
      public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the height:");
      double h=obj.nextDouble();
       System.out.println("Enter the radius:");
      double r=obj.nextDouble();
      double volume=Math.PI*r*r*h;
      double surfacearea=2*Math.PI*r*(r+h);
        System.out.println("volume of Cylinder is:"+volume);
        System.out.println("Surfacearea of Cylinder is:"+surfacearea);
}
}