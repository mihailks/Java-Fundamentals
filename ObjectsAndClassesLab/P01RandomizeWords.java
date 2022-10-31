package ObjectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split("\\s+");

        Random rdn = new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int first = rdn.nextInt(wordsArr.length);
            int second = rdn.nextInt(wordsArr.length);

            String temp = wordsArr[first];
            wordsArr[first] = wordsArr[second];
            wordsArr[second] = temp;
        }
        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
