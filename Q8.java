class Q8 {
    public static void main(String[] args) {
        int n = 833982;
        int[] freq = new int[10];

        while(n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        for(int i = 0; i < 10; i++) {
            if(freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}