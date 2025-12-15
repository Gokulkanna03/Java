 import java.util.*;
 public class Vote{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=obj.nextInt();
        
        if(age>=18)
        {

            System.out.println("The person is eligible for voting");
        }
       
        
         else {
             System.out.println("The person is not eligible for Voting");
        }
        
    
}
 }
 
