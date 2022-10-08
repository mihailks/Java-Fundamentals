package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int snowBalls = Integer.parseInt(scanner.nextLine());
        double quality = 0;
        double highestQ = 0;
        int MaxSnowballSnow = 0;
        int MaxSnowballTime = 0;
        int MaxSnowballQuality = 0;

        for (int i = 0; i < snowBalls; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            int test1 = snowballSnow / snowballTime;
            quality= Math.pow(test1,snowballQuality);
            if (quality>highestQ){
                highestQ=quality;
                MaxSnowballSnow = snowballSnow;
                MaxSnowballTime = snowballTime;
                MaxSnowballQuality = snowballQuality;
            }
            if (i==snowBalls-1){
                System.out.printf("%d : %d = %.0f (%d)",MaxSnowballSnow,MaxSnowballTime,highestQ,MaxSnowballQuality);
            }

        }
    }
}
