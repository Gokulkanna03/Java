
import java.util.Scanner;

public class FirstOddEven {
    public static void main(String[] args)
    {
       Scanner oddeven=new Scanner(System.in);
       System.out.println("Enter the value:");
      int num=oddeven.nextInt();
      int FirstDigit=num/100;
      if((FirstDigit&1)==0)
      System.out.println("The number is even");
    else
        System.out.println("The number is odd");

    }
}
