import java.util.Scanner;

public class PrimeNonePrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minn = 0, maxx = 0;
        int state2;
        boolean check = true;

        while (check) {
            String n = sc.nextLine();

            if (n.equals("stop")) {
                check = false;

            } else {
                int num = Integer.parseInt(n);

                if (num != 12 && num > 1){
                    if (isPrime(num) && (minn == 0 || num < minn)){
                        minn = num;
                    }
                    else if (!isPrime(num) && (maxx == 0 || num > maxx)){
                        maxx = num;
                    }
                } else {
                    System.out.println("invalid");
                }
            }
        }

        if (maxx == 0 && minn == 0) state2 = 0;
        else if (maxx == 0) state2 = 1;
        else if (minn == 0) state2 = 2;
        else state2 = 3;

        switch (state2) {
            case 0 -> System.out.println("prime_undefined\nnon-prime_undefined");
            case 1 -> System.out.println("prime_" + minn + "\nnon-prime_undefined");
            case 2 -> System.out.println("non-prime_" + maxx + "\nprime_undefined");
            case 3 -> System.out.println("non-prime_" + maxx + "\nprime_" + minn);
        }

    }

    private static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
