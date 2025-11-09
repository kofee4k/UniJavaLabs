import java.util.Scanner;

public class NumberInList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 12;

        int number;
        boolean inFirst, inSecond;

        do {
            number = Integer.parseInt(sc.nextLine());
            inFirst = ((number <= 5 * N) && (number >= 1 * N));
            inSecond = ((number <= 15 * N) && (number >= 11 * N));
            if (!inFirst && !inSecond){
                System.out.println("Not_yet");
            }
        } while (!inFirst && !inSecond);

        System.out.println("Correct_number_"+number);
    }
}
