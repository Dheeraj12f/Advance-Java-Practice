class Q9 {
    public static void main(String[] args) {
        int n = 12345;
        int rotations = 2;

        for(int i = 0; i < rotations; i++) {
            int last = n % 10;
            n = n / 10;
            int pow = (int)Math.pow(10, String.valueOf(n).length());
            n = last * pow + n;
        }
                        
        System.out.println(n);
    }
}
