package semester1;

import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;
        String place = "";
        int neededMoney = 0;
        int savedMoney = 0;

        boolean check = true;

        while (check) {
            input = sc.nextLine();
            boolean isNum = isNumber(input);
            if (input.toLowerCase().equals("stop")) {
                check = false;
            }
            else if (!isNum) {
                place = input;
                neededMoney = Integer.parseInt(sc.nextLine());
                if (savedMoney >= neededMoney) {
                    System.out.println("Going to " + place);
                    savedMoney -= neededMoney;
                }
            }

            else {
                int money = Integer.parseInt(input);
                savedMoney += money;

                if (savedMoney >= neededMoney && !place.equals("")) {
                    System.out.println("Going to " + place);
                    savedMoney -= neededMoney;
                }
            }
        }
        sc.close();
    }

    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
