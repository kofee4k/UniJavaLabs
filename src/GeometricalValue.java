import java.util.Scanner;

public class GeometricalValue {
    static double area(int a, int b, int c, int d, int e, int f) {
        double s = 0.5 * Math.abs(a * (d - f) + c * (f - b) + e * (b - d));
        return s;
    }
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in);

        int N = 12;
        int a = sc.nextInt()*N;
        int b = sc.nextInt()*N;
        int c = sc.nextInt()*N;
        int d = sc.nextInt()*N;
        int e = sc.nextInt()*N;
        int f = sc.nextInt()*N;

        double result = area(a, b, c, d, e, f);

        System.out.printf("%.2f%n", result);

    }
}



