import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.");
        int a = sc.nextInt();
        // int a = 45;
        if(a<0){
            System.out.println("it is neative number.");
        }else if(a>0){
            System.out.println("it is positive number.");
        }else{
            System.out.println("number is zero.");
        }
        sc.close();
    }
}
