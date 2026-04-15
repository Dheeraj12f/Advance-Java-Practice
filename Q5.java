class Q5 {
    public static void main(String[] args) {
        int n = 6;
        int a = 1, b = 1;

        System.out.print(a + " " + b + " ");

        for(int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}