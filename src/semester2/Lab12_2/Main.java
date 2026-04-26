package semester2.Lab12_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");

        Stack stack = new Stack(tokens.length);

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("x")) {
                if (stack.size() < 2) {
                    System.out.println("Ошибка: недостаточно чисел для оператора \"" + token + "\"");
                    return;
                }

                Integer b = stack.pop();
                Integer a = stack.pop();

                int result = switch (token) {
                    case "+"  -> a + b;
                    case "-"  -> a - b;
                    default   -> a * b;
                };

                stack.push(result);

            } else {
                try {
                    stack.push(Integer.parseInt(token));
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: неизвестный токен \"" + token + "\"");
                    return;
                }

            }
        }

        if (stack.size() > 1) {
            System.out.println("Ошибка: слишком много чисел, не хватает операторов");
            return;
        }

        if (stack.size() == 0) {
            System.out.println("Ошибка: выражение пустое");
            return;
        }

        System.out.println(stack.pop());
    }
}
