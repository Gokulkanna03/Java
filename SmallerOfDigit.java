import java.util.Scanner;

public class SmallerOfDigit {
     public static void main(String[] args)
    {
       Scanner num=new Scanner(System.in);
       System.out.println("Enter the value:");
      int a=num.nextInt();
       System.out.println("Enter the value:");
      int b=num.nextInt();
       System.out.println("Enter the value:");
      int c=num.nextInt();
    if(a<=b && a<=c){
         System.out.println(a+" is the Smallest number");
     }
    else if(b<=a && b<=c){
        System.out.println(b+ " is the Smallest number");   
}
    else{
        System.out.println(c+" is the Smallest number");
    }
}
}
