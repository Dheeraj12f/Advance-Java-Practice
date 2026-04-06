import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start year:");
        int start = sc.nextInt();
        System.out.println("Enter end year:");
        int end = sc.nextInt();

        System.out.println("Leap years with digit sum divisible by 4:");
        for (int year = start; year <= end; year++) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                int sum = digitSum(year);
                if (sum % 4 == 0) {
                    System.out.println(year);
                }
            }
        }
    }

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
