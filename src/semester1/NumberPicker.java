package semester1;

import java.util.Scanner;

public class NumberPicker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Integer minn = null;
        if (n>0){
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();

                if (number > 0) {
                    if (minn == null || number < minn) {
                        minn = number;
                    }
                }
            }
            if (minn == null)
                System.out.println("undefined");
            else
                System.out.println(minn);
        }
        else{
            System.out.println("invalid");
        }

    }
}