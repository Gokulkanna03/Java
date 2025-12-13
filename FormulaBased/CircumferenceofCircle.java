 import java.util.Scanner;

public class CircumferenceofCircle{
      public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the radius:");
      int r=obj.nextInt();
     double CircumferenceofCiecle=2*Math.PI*r;
     System.out.println("The Circumference of the circle is:"+CircumferenceofCiecle);
}
}
