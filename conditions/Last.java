import java.util.*;
public class Last
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    	System.out.println("Enter the year");
	    int Year1=obj.nextInt();
	    System.out.println("Enter the year");
	    int year2=obj.nextInt();
	   int b=Year1%10;
	   int  c=year2%100;
	    if(b==c){
	        System.out.println("The last digit is same");
	    }
	    else{
	        System.out.println("The last digit is not same");
	    }
	    
	}
}


