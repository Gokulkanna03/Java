import java.util.Scanner;

public class Smaller {
    public static void main(String[] args) {
		Scanner small=new Scanner(System.in);
		System.out.println("Enter the value a:");
		int a=small.nextInt();
		System.out.println("Enter the value b:");
		int b=small.nextInt();
		if(a<b)
			System.out.println("a is the lesser number");
		else
			System.out.println("b is the lesser number");


	}
}
