 import java.util.*;
 public class FeverCheck{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the temperature:");
        double temp =obj.nextDouble();
       
        if(temp>100)
        {

            System.out.println("The preson has fever");
        }
        
         else {
             System.out.println("The preson does not have fever");
        }
      
    
}
 
 
    
}
