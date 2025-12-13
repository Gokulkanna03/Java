import java.util.Scanner;
public class ProductOf35 {
   public static void main(String[] args)
    {
       Scanner num=new Scanner(System.in);
       System.out.println("Enter the number a:");
      int number=num.nextInt();   
      if(number%3==0 && number%5==0){
         System.out.println(number+" The number is divisible by both 3 and 5");
      }
   else{
      System.out.println(number+"The number is not divisible by both 3 and 5");
   }
}
}