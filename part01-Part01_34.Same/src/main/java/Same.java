
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        String password2 = scan.nextLine();

        if (password.equals(password2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }    
    }
}
