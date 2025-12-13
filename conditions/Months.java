import java.util.*;

class Months {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print( "Enter the month (1-12):");
        int month = obj.nextInt();

        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("It is Winter.");
             break;
             case 3:
            case 4:
            case 5:
                System.out.println("it is spring");
                break;
            case 6:
            case 7:
                case 8:
                System.out.println("It is a summer");
                break;
                case 9:
                    case 10:
                        case 11:
                            System.out.println("It is Autumn");
                            break;
            default:
                System.out.println("Invalid month");
        }
    }
}

