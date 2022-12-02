package PF01ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] command = scanner.nextLine().split("\\|");
        StringBuilder message = new StringBuilder(input);
        while (!command[0].equals("Decode")) {

            switch (command[0]) {
                case "Move":
                    int index = Integer.parseInt(command[1]);
                    String textToBack = message.substring(0, index);
                    message.delete(0, index);
                    message.append(textToBack);
                    break;
                case "Insert":
                    index = Integer.parseInt(command[1]);
                    String toInsert = command[2];
                    message.insert(index,toInsert);
                    break;
                case "ChangeAll":
                    String oldString = command[1];
                    String newString = command[2];
                    String replaceText = message.toString().replace(oldString,newString);
                    message = new StringBuilder(replaceText);
                    break;
            }
            command = scanner.nextLine().split("\\|");
        }
        System.out.printf("The decrypted message is: %s\n", message);
    }
}
