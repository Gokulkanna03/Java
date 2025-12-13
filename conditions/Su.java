
import java.util.Scanner;

public class Su {
     public static void main(String[] args)
    {
       Scanner Diff=new Scanner(System.in);
       System.out.println("Enter the value a:");
      int a=Diff.nextInt();
        System.out.println("Enter the value b:");
      int b=Diff.nextInt();
      int num=a+b;
      if((num&1)==0)
      System.out.println("The number is even");
    else
        System.out.println("The number is odd");

    }
}
