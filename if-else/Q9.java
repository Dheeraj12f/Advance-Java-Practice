import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int note = sc.nextInt();

        if (note == 2000 || note == 500 || note == 200 || note == 100 || note == 50) {
            System.out.println("Valid currency note");
        } else {
            System.out.println("Invalid currency note");
        }
    }
}

