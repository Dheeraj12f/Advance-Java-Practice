class Q10 {
    public static void main(String[] args) {
        int n = 25;
        int square = n * n;

        if(String.valueOf(square).endsWith(String.valueOf(n))) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }
    }
}