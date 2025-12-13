import java.util.Scanner;

public class Three {
     public static void main(String[] args)
    {
       Scanner td=new Scanner(System.in);
       System.out.println("Enter the value:");
      int a=td.nextInt();

     if(a>99 && a<1000)
      System.out.println("IT is three digit number");
    else
        System.out.println("Not a three digit number");

    }
}
