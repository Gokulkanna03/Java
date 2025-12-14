import java.util.*;
public class BytesToBit {
    public static void main(String[]args){
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the Bytes:");
  double Bytes=obj.nextDouble();
   double Bits=Bytes*8;
   System.out.println("The number of Bits:"+ Bits +"Bits");

    }
}
