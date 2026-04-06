import java.util.Scanner;
//ATM currency denomination
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();

        int[] notes = {2000, 500, 200, 100, 50};
        System.out.println("Currency Denomination:");
        for (int note : notes) {
            int count = amt / note;
            if (count > 0) {
                System.out.println(note + " x " + count + " = " + (note * count));
                amt -= note * count;
            }
        }
    }
}

