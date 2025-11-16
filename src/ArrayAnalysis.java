import java.util.Scanner;
import java.util.Arrays;

public class ArrayAnalysis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");

        String arrFinal = "";

        for (String x : arr1) {
            boolean found = false;

            for (String y : arr2) {
                if (x.equals(y)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                arrFinal += x + " ";
            }
        }
        for (String x : arr2) {
            boolean found = false;

            for (String y : arr1) {
                if (x.equals(y)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                arrFinal += x + " ";
            }
        }
        System.out.println(arrFinal);
    }
}
