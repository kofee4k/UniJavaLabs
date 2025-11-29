import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int R = Integer.parseInt(sc.nextLine());
        int C = Integer.parseInt(sc.nextLine());
        int N = 1;
        int k = 0;
        int first = (11+R+C-1)*N;

        String Array = "";

        System.out.println(ArrayBuilder(R, k, N, C, first, Array));
    }
    public static String ArrayBuilder(int R, int k, int N, int C, int firstNum, String Array){
        for (int i = 0; i<C; i++){
            Array += firstNum - N*i + " ";
        }
        k += 1;
        if (k < R){
            firstNum -= N;
            Array += "\n";
            return ArrayBuilder(R, k, N, C, firstNum, Array);
        }
        else{
            return Array.trim();
        }
    }
}
