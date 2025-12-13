import java.util.Scanner;

public class Triangle{
      public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the Length:");
      int Base=obj.nextInt();
       System.out.println("Enter the Breath:");
      int height=obj.nextInt();
     double area=0.5*Base*height;
     System.out.println("Area of triangle is:"+area);
}
}