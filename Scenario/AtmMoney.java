import java.util.*;
public class AtmMoney {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
   System.out.print("Enter amount: ");
        int amount = obj.nextInt();
        int n500 = amount / 500;
        amount = amount % 500;
        int n200 = amount / 200;
        amount = amount % 200;
        int n100 = amount / 100;
        amount = amount % 100;
        int n50 = amount / 50;
        amount = amount % 50;
        int n20 = amount / 20;
        amount = amount % 20;
       int n10 = amount / 10;
        amount = amount % 10;
        System.out.println("500"+n500);
        System.out.println("200"+n200);
        System.out.println("100"+n100);
        System.out.println("50"+n50);
        System.out.println("20"+n20);
        System.out.println("10"+ n10);
        

    }
}
