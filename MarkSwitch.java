import java.util.*;
public class MarkSwitch {
     public static void main(String[] args){
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter the marks:");
         int Mark=obj.nextInt();
         switch (Mark/10) {
            case 10:
            case 9: System.out.println("Grade A");
                break;
                 case 8:
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
            case 5:
                System.out.println("Grade: C");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Fail");
                break;
                 default:
                 System.out.println("invalid Marks");
                break;
         }
         
    }
}
