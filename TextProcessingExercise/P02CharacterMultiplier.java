package TextProcessingExercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String str1 = input[0];
        String str2 = input[1];

        int str1Length = str1.length();
        int str2Length = str2.length();

        int minLength = Math.min(str1Length,str2Length);
        int totalSum = 0;
        for (int i = 0; i < minLength; i++) {
            int firstChar = str1.charAt(i);
            int secondChar = str2.charAt(i);
            totalSum+=(firstChar*secondChar);
        }
        if (str1Length>str2Length){
            for (int i = str2Length; i < str1Length; i++) {
                totalSum+=str1.charAt(i);
            }
        } else if (str1Length<str2Length){
            for (int i = str1Length; i < str2Length; i++) {
                totalSum+=str2.charAt(i);
            }
        }
        System.out.println(totalSum);
    }
}
