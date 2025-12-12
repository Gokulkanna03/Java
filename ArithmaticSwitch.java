import java.util.*;
public class ArithmaticSwitch {
    public static void main(String[] args){
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter the first number:");
         int num1=obj.nextInt();
          System.out.println("Enter the Second number:");
         int num2=obj.nextInt();
         System.out.println("Enter the operation:");
         char opp=obj.next().charAt(0);
         int result=0;
         switch (opp) {
            case '+': result=num1+num2;
            break;
            case '-': result=num1-num2;
            break;
            case '*': result=num1*num2;
            break;
            case '/': result=num1/num2;
            break;
            case '%': result=num1%num2;
            break;
                
                 default:
                    System.out.println("invalid operation");
                break;
         }
         System.out.println("The result is"+ result);
    }
   
    
}
