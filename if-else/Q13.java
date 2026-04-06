import java.util.Scanner;
//clasify password strength
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password:");
        String password = sc.nextLine();

        boolean hasLetter = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) hasLetter = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        int length = password.length();

        if ((hasLetter && !hasDigit && !hasSpecial) || (!hasLetter && hasDigit && !hasSpecial) || length < 6) {
            System.out.println("Weak Password");
        } else if (hasLetter && hasDigit && !hasSpecial && length >= 6 && length < 8) {
            System.out.println("Medium Password");
        } else if (hasLetter && hasDigit && hasSpecial && length >= 8) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Password does not fit defined categories");
        }
    }
}
