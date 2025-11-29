import java.util.Scanner;

public class TextTransform {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        char oldC = sc.next().charAt(0);
        char newC = sc.next().charAt(0);

        String resultNums = input.substring(0,start) + input.substring(end + 1);
        String resultChar = resultNums.replace(oldC, newC);

        System.out.println(resultNums);
        System.out.println(resultChar);
        System.out.println(resultChar.toLowerCase());
        sc.close();
    }
}



