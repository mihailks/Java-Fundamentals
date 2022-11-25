package TextProcessingExercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String input = scanner.nextLine();
//        StringBuilder extension = new StringBuilder();
//        StringBuilder fileName = new StringBuilder();
////        for (int i = input.length() - 1; i > 0; i--) {
////            if (input.charAt(i) != '.') {
////                extension.append(input.charAt(i));
////            }
////
////        }

        String[] input = scanner.nextLine().split("\\\\");

        String fileName = input[input.length-1].split("\\.")[0];
        String extension = input[input.length-1].split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
