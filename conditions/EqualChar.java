import java.util.*;
public class EqualChar {
    public static void main(String[] args){
     Scanner obj =new Scanner(System.in);
     System.out.println("Enter the character1: ");
     char ch1=obj.next().charAt(0);
     System.out.println("Enter the character2:");
      char ch2=obj.next().charAt(0);
      if(ch1==ch2){
        System.out.println("Characters are equal");
      }
      else{
        System.out.println("Characters are not equal");
      }
    }
    
}
