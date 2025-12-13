
import java.util.Scanner;

public class LastOddEven {
    public static void main(String[] args)
    {
       Scanner oddeven=new Scanner(System.in);
       System.out.println("Enter the value:");
      int num=oddeven.nextInt();
      int lastDigit=num%10;
      if((lastDigit&1)==0)
      System.out.println("The number is even");
    else
        System.out.println("The number is odd");

    }
}
