import java.util.*;
public class Pen{
    public static void main(String[]args){
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the Number of pen brought:");
  int Brought=obj.nextInt();
   System.out.println("Enter the price of pen:");
   double price=obj.nextDouble();
   double AmountPaid=(Brought/5)*3 + (Brought%5);
   double TotalPaid=AmountPaid*price;
   System.out.println("The TotalAmount Paid:"+ TotalPaid);

    }
}
