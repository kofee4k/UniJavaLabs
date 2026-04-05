package semester2.Lab11_2;

import java.io.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Path.of("src\\semester2\\Lab11_2\\task.txt")));
        String[] lines = content.split("\n");
        String[] result = new String[lines.length];

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            int eqIndex = line.indexOf('=');
            String expression;
            if (eqIndex == -1) {
                expression = line;
            } else {
                expression = line.substring(0, eqIndex);
            }
            result[i] = expression + "=" + solve(expression);
        }

        Files.write(Path.of("src\\semester2\\Lab11_2\\task.txt"), String.join("\n", result).getBytes());
    }

    static String solve(String expr) {
        for (char c : expr.toCharArray()) {
            if (!Character.isDigit(c)) return "invalid";
        }

        int maxDigit = 0;
        for (char c : expr.toCharArray()) {
            maxDigit = Math.max(maxDigit, c - '0');
        }

        int base = maxDigit + 1;

        if (base < 2 || base > 9) return "invalid";

        int decimalValue = 0;
        for (char c : expr.toCharArray()) {
            decimalValue = decimalValue * base + (c - '0');
        }

        return String.valueOf(decimalValue);
    }
}
