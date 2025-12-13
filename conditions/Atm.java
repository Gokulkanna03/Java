import java.util.*;
public class Atm {
    public static void main(String[] args){
         Scanner obj = new Scanner(System.in);
         int Balance=10000;
         int amount;
         int choice;
         System.out.println("mini atm");
         System.out.println("1.Balance check");
         System.out.println(("2. withdraw money"));
         System.out.println("3.Deposite money");
         System.out.println("4. Exit");
         System.out.println("Enter your choice:");
        choice=obj.nextInt();
         switch (choice){
            case 1:
                System.out.println("Your current balance is "+ Balance);
                break;
                case 2:
                    System.out.println("Enter the deposite amount:");
                    amount=obj.nextInt();
                    Balance+=amount;
                    System.out.println("Amount was deposited");
                    System.out.println("current balance is"+Balance);
                    break;
                    case 3:
                        System.out.println("Amount to be withdrawn:");
                        amount=obj.nextInt();
                        if((Balance>0)&&(amount<=Balance)){
                            Balance-=amount;
                            System.out.println("collect your cash");
                            System.out.println("Curreent balance is"+Balance);
                        }
                        else{
                            System.out.println("Insufficient balance");
                        }
                        break;
                        case 4:
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("invalid Choice");         }
            
    }
    
}
