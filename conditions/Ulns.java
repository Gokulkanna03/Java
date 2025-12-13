import java.util.*;
public class Ulns {
    public static void main(String[] args){
     Scanner obj =new Scanner(System.in);
     System.out.println("Enter the character: ");
     char ch=obj.next().charAt(0);
     if(ch>='A' && ch<='Z'){
        System.out.println("Uppercase Letter");
     }
     else if(ch>='a' && ch<='z'){
        System.out.println("Lowercase letter");
     }
     else if(ch>='0' && ch<='9'){
        System.out.println("Digit");
     }
     else{
        System.out.println("Symbol");
     }

  }
    }