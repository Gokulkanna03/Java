import java.util.*;
public class DistanceTravelled {
    public static void main(String[]args){
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the Speed in km/hr:");
  double Speed=obj.nextDouble();
  System.out.println("Enter the Time hr:");
  double Time=obj.nextDouble();
   double Distance=Speed*Time;
   System.out.println("The min secounds:"+ Distance +"km");

    }
}
