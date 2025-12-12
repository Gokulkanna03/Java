import java.util.Scanner;
public class ProductOf37 {
   public static void main(String[] args)
    {
       Scanner num=new Scanner(System.in);
       System.out.println("Enter the number a:");
      int number=num.nextInt();   
      if(number%3==0 && number%7==0){
         System.out.println(number+" The number is divisible by both 3 and 7");
      }
   else{
      System.out.println(number+"The number is not divisible by both 3 and 7");
   }
}
}