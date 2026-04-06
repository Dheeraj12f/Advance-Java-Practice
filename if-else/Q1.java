import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.");
        int a = sc.nextInt();
        // int a = 45;
        if(a%2==0){
            System.out.println("it is even number");
        }else{
            System.out.println("it is odd number");
        }
        sc.close();
    }
}
