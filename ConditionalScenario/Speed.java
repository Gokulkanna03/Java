import java.util.*;

public class Speed {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print(" vehicle speed : ");
        int speed = obj.nextInt();

        if (speed >=100) {
            System.out.println("Speed exeeds");
        } else {
            System.out.println("Within limit");
        }

    }
}
