import java.util.*;
class Q1{
    public static void main(String[] args) {
        //For Loop..................
        // for(;true;){}  -------------  // //it will return always true and give infinite loop beacause condition is true.

        // for(int i = 1; i<=50;){}----------//it will also run infinit time as i value is not incremented , it always be 1.
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any  no. :");
          int a = sc.nextInt();
          for(int i = 0; i<a;i+=2){
            System.out.println(i);
          }
    }
}