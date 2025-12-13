import java.util.*;
public class SinTwoThree {
     public static void main(String[] args)
    {
       Scanner num=new Scanner(System.in);
       System.out.println("Enter the number num:");
      int digit=num.nextInt();
      if(digit>=0 && digit<=9){
        System.out.println("Single digit number");
      }
      else if(digit>=10 && digit<=99){
        System.out.println("Two digit number");
      }
      else if(digit>=100 && digit<=999){
        System.out.println("Three digit number");
      } 
      else{
        System.out.println("Condotion not satisfied");
      }
}
}
