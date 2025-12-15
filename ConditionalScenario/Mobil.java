 import java.util.*;
 public class Mobil{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter battery Charege precentage:");
        double Charege =obj.nextDouble();
       
        if(Charege<=20)
        {

            System.out.println("Low Battery");
        }
        else if(Charege<50){
             System.out.println("50 percent charge is Consumed");
        }
         else {
             System.out.println("Full Charge");
        }
      
    
}
 }
