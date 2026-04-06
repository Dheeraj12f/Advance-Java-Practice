import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userId = "admin";
        String password = "1234";

        System.out.print("Enter User ID: ");
        String uid = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (uid.equals(userId) && pass.equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid User ID or Password");
        }
    }
}
