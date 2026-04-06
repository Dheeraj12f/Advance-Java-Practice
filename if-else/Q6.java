import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a >= b && a >= c) System.out.println("Greatest: " + a);
        else if (b >= a && b >= c) System.out.println("Greatest: " + b);
        else System.out.println("Greatest: " + c);
    }
}
