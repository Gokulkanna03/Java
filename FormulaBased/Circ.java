import java.util.Scanner;

public class Circ{
      public static void main(String[] args)
    {
      
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the Radius :");
      double r=obj.nextInt();
     double area=Math.PI*r*r;
     System.out.printf("Area of Circle is:"+ "%.2f",area);
}
}