import java.util.*;
public class ConVol {
    public static void main(String[] args){
     Scanner obj =new Scanner(System.in);
     System.out.println("Enter the character: ");
     char ch=obj.next().charAt(0);
     ch=Character.toLowerCase(ch);
     if(ch>='a' && ch<='z'){
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        System.out.println("The character is a vowle");
     }
     else{
        System.out.println("The character is a consonants");
     }
     

     }
    }
}
