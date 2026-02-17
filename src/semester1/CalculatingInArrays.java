package semester1;

import java.util.Scanner;

public class CalculatingInArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int leftTriangle = 0;
        int middleLine = 0;
        int rightTriangle = 0;
        int k = 0;

        for (int i=0; i < n; i++){
            String[] Array = sc.nextLine().split(" ");
            for (int j=0; j < n; j++){
                if (j < k){
                    leftTriangle += Integer.parseInt(Array[j]);
                }
                else if (j == k) {
                    middleLine += Integer.parseInt(Array[j]);
                }
                else{
                    rightTriangle += Integer.parseInt(Array[j]);
                }
            }
            k += 1;
        }
        System.out.println(rightTriangle + "\n" + middleLine + "\n" + leftTriangle);
    }
}
