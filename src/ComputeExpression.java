import java.util.Scanner;

public class ComputeExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        double N = 12;

        double frc = (a + b) / N;
        double inner = Math.abs(Math.pow(N, 2) / b);
        double logP = Math.log(inner) / Math.log(a);
        double result = frc + logP;

        System.out.printf("Результат: %.3f", result);
    }
}