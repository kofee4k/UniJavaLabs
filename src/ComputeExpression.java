import java.util.Scanner;

public class ComputeExpression {
    public static void main(String[] args) {
        byte N = 12;
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double frc = (a + b) / N;
        double inner = Math.abs(Math.pow(N, 2) / b);
        double logP = Math.log(inner) / Math.log(a);
        double result = frc + logP;

        System.out.printf("%.3f", result);
    }
}




