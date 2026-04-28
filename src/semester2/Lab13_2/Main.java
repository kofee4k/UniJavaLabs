package semester2.Lab13_2;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> book = new HashMap<>();

        while (true) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("stop")) {
                break;

            } else if (input.startsWith("search ")) {
                String query = input.substring(7).trim().toLowerCase();
                ArrayList<String> found = new ArrayList<>();

                for (String key : book.keySet()) {
                    String name = key.split(":", 2)[1];
                    if (name.toLowerCase().contains(query)) {
                        found.add(key);
                    }
                }

                if (found.isEmpty()) {
                    System.out.println("no phones");
                } else {
                    Collections.sort(found);
                    for (String key : found) {
                        String gender = key.split(":", 2)[0];
                        String name   = key.split(":", 2)[1];
                        System.out.println(book.get(key) + " - " + name + ", " + gender);
                    }
                }

            } else if (input.equalsIgnoreCase("boys")) {
                printByGender(book, "m");

            } else if (input.equalsIgnoreCase("girls")) {
                printByGender(book, "w");

            } else {
                String[] parts = input.split(", ", 3);
                if (parts.length < 3) {
                    System.out.println("Ошибка: неверный формат");
                    continue;
                }
                String gender = parts[0].trim();
                String name   = parts[1].trim();
                String phone  = parts[2].trim();

                if (name.isEmpty()) {
                    System.out.println("Ошибка: имя не может быть пустым");
                    continue;
                }
                if (!gender.equals("m") && !gender.equals("w")) {
                    System.out.println("Ошибка: пол должен быть m или w");
                    continue;
                }

                String key = gender + ":" + name;
                book.put(key, phone);
            }
        }
    }

    static void printByGender(HashMap<String, String> book, String gender) {
        ArrayList<String> found = new ArrayList<>();

        for (String key : book.keySet()) {
            if (key.startsWith(gender + ":")) {
                found.add(key);
            }
        }

        if (found.isEmpty()) {
            System.out.println("no phones");
        } else {
            Collections.sort(found);
            for (String key : found) {
                String name = key.split(":", 2)[1];
                System.out.println(book.get(key) + " - " + name);
            }
        }
    }
}
