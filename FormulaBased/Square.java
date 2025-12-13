import java.util.Scanner;

public class Square{
      public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the side:");
      int a=obj.nextInt();
     int area=a*a;
     System.out.println("Area of Square is:"+area);
}
}