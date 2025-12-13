import java.util.Scanner;

public class ProductOfNePo {
      public static void main(String[] args)
    {
       Scanner num=new Scanner(System.in);
       System.out.println("Enter the number a:");
      int a=num.nextInt();
       System.out.println("Enter the number b:");
      int b=num.nextInt();
      int c=a*b;
    if(c>0){
         System.out.println(c+" is the positive number");
     }
    else {
        System.out.println(c+ " is the negative number");   
}
  
 }
}