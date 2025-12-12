import java.util.Scanner;
public class  Digit258 {
   public static void main(String[] args)
    {
       Scanner num=new Scanner(System.in);
       System.out.println("Enter the number :");
      int number=num.nextInt();   
      if(number%2==0 && number%5==0 && number%8!=0){
         System.out.println(number+" The conditon is satisfied");
      }
   else{
      System.out.println(number+"The condition is not satisfied");
   }
}
}