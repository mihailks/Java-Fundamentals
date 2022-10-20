package ListsMoreExercise;

import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String letters = "";
        String digits = "";
        String takeDigits = "";
        String skipDigits = "";
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                digits += input.charAt(i);
            } else {
                letters += input.charAt(i);
            }
        }
        for (int i = 0; i < digits.length(); i++) {
            if (i % 2 == 0) {
                takeDigits += digits.charAt(i);
            } else {
                skipDigits += digits.charAt(i);
            }
        }
//        int counter=0;
//        int test1 = getNumericValue(takeDigits.charAt(counter));
//        int test2 = letters.length();
//        for (int i = test1; i < letters.length(); i++) {
//            i+=getNumericValue(skipDigits.charAt(counter));
//            counter++;
//            for (int j = 0; j < getNumericValue(takeDigits.charAt(counter)); j++) {
//                result+=letters.charAt(i);
//                i++;
//            }
//            counter++;
//        }


        System.out.println(result);
    }
}
