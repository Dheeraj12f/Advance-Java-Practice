import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        // Check validity
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");

            // Classification
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }

            // Right angled check (Pythagoras theorem)
            if (a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a) {
                System.out.println("Right Angled Triangle");
            }
        } else {
            System.out.println("Not a Valid Triangle");
        }
    }
}
