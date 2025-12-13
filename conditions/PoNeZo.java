import java.util.Scanner;

public class PoNeZo {
      public static void main(String[] args)
    {
       Scanner num=new Scanner(System.in);
       System.out.println("Enter the number:");
      int number=num.nextInt();
    if(number>0){
         System.out.println(number+" is the positive number");
     }
    else if(number<0){
        System.out.println(number+ " is the negative number");   
}
    else{
        System.out.println(number+" is the zero number");
    }
}
}