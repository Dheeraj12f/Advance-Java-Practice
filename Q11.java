class Q11 {
    public static void main(String[] args) {
        int n = 5, count = 0;

        for(int i = 5; i <= n; i *= 5) {
            count += n / i;
        }

        System.out.println(count);
    }
}