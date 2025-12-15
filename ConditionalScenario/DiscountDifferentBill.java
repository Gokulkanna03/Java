 import java.util.*;
 public class DiscountDifferentBill{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("{Enter the bill Amount:");
        double billAmount=obj.nextDouble();
        double discount=0;
        if(billAmount<1000)
        {

            System.out.println("no discounts");
        }
        else if(billAmount>=1000 && billAmount<2000){
             discount=billAmount*0.10;
        }
         else if(billAmount>=2000 && billAmount<4000){
             discount=billAmount*0.20;
        }
         else {
             discount=billAmount*0.30;
        }
        double FinalAmount=billAmount-discount;
        System.out.println("The discount is:"+ discount);
         System.out.println("The Amount Paid is:"+ FinalAmount);
    
}
 }
