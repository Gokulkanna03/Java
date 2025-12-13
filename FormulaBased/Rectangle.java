import java.util.Scanner;

public class Rectangle{
      public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the Length:");
      int length=obj.nextInt();
       System.out.println("Enter the Breath:");
      int breath=obj.nextInt();
     int area=length*breath;
     System.out.println("Area of rectangle is:"+area);
}
}