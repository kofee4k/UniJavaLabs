import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = Integer.parseInt(sc.nextLine());
        int C = Integer.parseInt(sc.nextLine());;
        int k = 0;
        int first = 10 + R + C;

        int[][] array = new int[R][C];

        arrayBuilder(array, R, C, k, first);
        printArray(array, R, C);

        sc.close();
    }
    public static void arrayBuilder(int[][] array, int R, int C, int k, int firstNum) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                array[i][j] = firstNum - j;
            }
            firstNum -= 1;
        }
    }
    public static void printArray(int[][] array, int R, int C) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                String arrayPrnt = array[i][j] + " ";
                if (j == C-1){
                    arrayPrnt = array[i][j] + "";
                }
                System.out.print(arrayPrnt);
            }
            System.out.println();
        }
    }
}

