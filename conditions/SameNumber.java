import java.util.Scanner;

public class SameNumber {
    
     public static void main(String[] args)
    {
       Scanner num=new Scanner(System.in);
       System.out.println("Enter the number num1:");
      int num1=num.nextInt();
      System.out.println("Enter the number num2:");
      int num2=num.nextInt();
      if(num1%10 == num2%10){
        System.out.println("Have the same last digit");
      }
      else{
        System.out.println("Do not have the same last digit");
      }
}
}
