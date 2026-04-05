package semester2.Lab11_1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("src\\semester2\\Lab11_1\\example.txt"))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                char c = (char) ch;
                if (Character.isDigit(c)) {
                    sum += (c - '0');
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        System.out.println("Сумма цифр: " + sum);
    }
}
