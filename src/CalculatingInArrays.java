import java.util.Scanner;

public class CalculatingInArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        int leftTriangle = 0;
        int middleLine = 0;
        int rightTriangle = 0;
        int k = 0;

        for (int i=0; i < N; i++){
            String[] Array = sc.nextLine().split(" ");
            for (int j=0; j < N; j++){
                if (j < k){
                    leftTriangle += Integer.parseInt(Array[j]);
                }
                if (j == k) {
                    middleLine += Integer.parseInt(Array[j]);
                }
                if (j > k){
                    rightTriangle += Integer.parseInt(Array[j]);
                }
            }
            k += 1;

        }
        System.out.println(rightTriangle + "\n" + middleLine + "\n" + leftTriangle);
    }
}
