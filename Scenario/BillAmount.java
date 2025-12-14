import java.util.*;
public class BillAmount {
    public static void main(String[]args){
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the Total Amount Paid:");
  double Total=obj.nextDouble();
   double Div=Total/3;
   System.out.println("The Amount to be give by each one is: "+ Div);

    }
}
