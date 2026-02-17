package semester1;

import java.util.Scanner;

public class NumberInList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 100;
        int number = Integer.parseInt(sc.nextLine());
        boolean inFirst = (number <= 5 * N) && (number >= 1 * N);
        boolean inSecond = (number <= 15 * N) && (number >= 11 * N);
        while (!inFirst && !inSecond) {
            System.out.println("Not_yet");
            number = Integer.parseInt(sc.nextLine());
            inFirst = (number <= 5 * N) && (number >= 1 * N);
            inSecond = (number <= 15 * N) && (number >= 11 * N);
        }
        System.out.println("Correct_number_" + number);
    }
}

