import java.util.*;
public class Mangoes {
    public static void main(String[]args){
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the Number of Mangoes brought:");
  int Brought=obj.nextInt();
   System.out.println("Enter the price of Mangoes:");
   double price=obj.nextDouble();
   double AmountPaid=(Brought/4)*3 + (Brought%4);
   double TotalPaid=AmountPaid*price;
   System.out.println("The TotalAmount Paid:"+ TotalPaid);

    }
}
