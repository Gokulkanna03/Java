import java.util.*;
public class Char {
    public static void main(String[] args){
     Scanner obj =new Scanner(System.in);
     System.out.println("Enter the character: ");
     char ch=obj.next().charAt(0);
     ch=Character.toLowerCase(ch);
     if(ch>='a' && ch<='z'){
        System.out.println("It is an alphabet");
     }
     else{
        System.out.println("It is not an alphabet");
     }

  }
    }