public class PrimeLess100 {
    public static boolean isPrime(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int n = 2;
        boolean check = true;
        for (int i = 0; i < n; i++) {
            check = isPrime(n);
            if (check) {
                System.out.println(n);
            }
            if (n < 100) {
                n++;
            }
        }
    }
}
