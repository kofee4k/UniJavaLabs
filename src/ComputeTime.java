import java.util.Scanner;

public class ComputeTime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String timeOld = sc.nextLine();
        int travelTime = Integer.parseInt(sc.nextLine());

        int hrsOld = Integer.parseInt(timeOld.substring(0,2));
        int minsOld = Integer.parseInt(timeOld.substring(3));

        int convertedTimeOld = hrsOld*60 + minsOld;

        int timeNew = (convertedTimeOld-travelTime)%1440;
        if (timeNew < 0) {
            timeNew += 1440;
        }
        int hrsNew = timeNew/60;
        int minsNew = timeNew%60;
        System.out.println(hrsNew + ":" + minsNew);
    }
}
