import java.util.*;
public class Discount {
    public static void main(String[]args){
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the price of the product:");
  double price=obj.nextDouble();
  System.out.println( "Enter the discount :" );
  double discount=obj.nextDouble();
   double DiscountPrice=price-(price*discount/100);
   System.out.println("The price after the discount amount is :"+ DiscountPrice);

    }
}
