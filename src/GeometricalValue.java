import java.util.Scanner;

public class GeometricalValue {
    static double area(int a, int b, int c, int d, int e, int f) {
        double s = 0.5 * Math.abs(a * (d - f) + c * (f - b) + e * (b - d));
        return s;
    }
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in);

        int N = 100;
        String AB = sc.nextLine();
        String CD = sc.nextLine();
        String EF = sc.nextLine();

        int a = Integer.parseInt(AB.substring(AB.indexOf("(")+1, AB.indexOf(",")))*N;
        int b = Integer.parseInt(AB.substring(AB.indexOf(",")+1, AB.indexOf(")")))*N;

        int c = Integer.parseInt(CD.substring(CD.indexOf("(")+1, CD.indexOf(",")))*N;
        int d = Integer.parseInt(CD.substring(CD.indexOf(",")+1, CD.indexOf(")")))*N;

        int e = Integer.parseInt(EF.substring(EF.indexOf("(")+1, EF.indexOf(",")))*N;
        int f = Integer.parseInt(EF.substring(EF.indexOf(",")+1, EF.indexOf(")")))*N;

        double result = area(a, b, c, d, e, f);

        System.out.printf("%.2f%n", result);
        sc.close();
    }
}
