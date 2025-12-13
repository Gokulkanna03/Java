import java.util.*;
public class Same
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
	        System.out.println("it has the same digit on first two and last two");
	    }
	    else{
	        System.out.println("it do not the same digit on first two and last two");
	    }
	    
	}
}


