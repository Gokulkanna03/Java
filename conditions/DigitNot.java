import java.util.*;
public class DigitNot {
    public static void main(String[] args){
     Scanner obj =new Scanner(System.in);
     System.out.println("Enter the Digit: ");
     char ch=obj.next().charAt(0);
    if(ch>='0' && ch<='9'){
        System.out.println("It is a digit");
     }
     else{
        System.out.println("It is not a digit");
     }

  }
    }