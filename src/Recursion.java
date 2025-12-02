import java.util.Scanner;

public class Recursion{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        double avg = average(text, 0, 0);
        System.out.println(avg);
    }

    public static double average(String text, int value, int count) {
        if (text.isEmpty()) {
            if (count == 0) {
                return 0;
            } else {
                return (double) value / count;
            }
        }

        int spaceIndex = text.indexOf(' ');
        String firstPart;
        String rest;

        if (spaceIndex == -1) {
            firstPart = text;
            rest = "";
        } else {
            firstPart = text.substring(0, spaceIndex);
            rest = text.substring(spaceIndex + 1);
        }

        try {
            int num = Integer.parseInt(firstPart);
            return average(rest, value + num, count + 1);
        } catch (NumberFormatException e) {
            return average(rest, value, count);
        }
    }
}
