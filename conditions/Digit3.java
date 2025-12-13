import java.util.*;

public class Digit3 {
      public static void main(String[] args) {
      Scanner obj= new Scanner(System.in);
      System.out.println("Enter the value:");
      int num = obj.nextInt();
      int lastdigit=num%10;
      if(lastdigit%3==0){
        System.out.println(num+" is divisible by 3");
      }
      else{
        System.out.println(num+" is not divisible by 3");
      }
}
}