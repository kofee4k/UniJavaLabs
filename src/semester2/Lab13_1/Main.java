package semester2.Lab13_1;

import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dict = new HashMap<>();
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("stop")) {
                break;
            } else if (input.startsWith("push ")) {
                String[] parts = input.substring(5).split(" ", 2);
                if (parts.length < 2) {
                    System.out.println("Ошибка: нужно указать аббревиатуру и термин");
                    continue;
                }
                String abbr = parts[0];
                String term = parts[1];
                if (dict.containsKey(abbr)) {
                    System.out.println("duplicate");
                } else {
                    dict.put(abbr, term);
                    System.out.println(dict);
                }
            } else if (input.startsWith("pop ")) {
                // "pop [abbreviation]"
                String abbr = input.substring(4).trim();
                if (!dict.containsKey(abbr)) {
                    System.out.println("Ошибка: аббревиатура не найдена");
                } else {
                    dict.remove(abbr);
                    System.out.println(dict);
                }
            } else if (input.startsWith("search ")) {
                String abbr = input.substring(7).trim();
                if (dict.containsKey(abbr)) {
                    System.out.println(dict.get(abbr));
                } else {
                    System.out.println("no such abbreviation");
                }
            } else {
                System.out.println("Ошибка: неизвестная команда");
            }
        }
    }
}

