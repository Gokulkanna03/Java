import java.util.Scanner;

public class Distance{
      public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the X1:");
      double X1=obj.nextDouble();
       System.out.println("Enter the Y1:");
      double Y1=obj.nextDouble();
       System.out.println("Enter the X2:");
      double X2=obj.nextDouble();
       System.out.println("Enter the Y2:");
      double Y2=obj.nextDouble();
    double  D=Math.sqrt(Math.pow(X2-X1, 2)+Math.pow(Y2-Y1,2));
    System.out.println("The distance between two points is "+D);
     
}
}