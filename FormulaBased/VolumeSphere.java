import java.util.Scanner;

public class VolumeSphere{
      public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the radius:");
      double r=obj.nextDouble();
      double volume=(4.0/3)*Math.PI*r*r*r;
      double SurfaceArea=4*Math.PI*r*r;
      System.out.println("Volume of Sphere is:"+volume);
     System.out.println("surfacearea of Sphere is:"+SurfaceArea);
}
}