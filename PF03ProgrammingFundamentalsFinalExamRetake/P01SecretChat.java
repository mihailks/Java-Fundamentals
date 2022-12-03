package PF03ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawMessage = scanner.nextLine();
        StringBuilder sb = new StringBuilder(rawMessage);
        String[] command = scanner.nextLine().split(":\\|:");
        while (!command[0].equals("Reveal")) {
            switch (command[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(command[1]);
                    sb.insert(index, " ");
                    System.out.println(sb);
                    break;
                case "Reverse":
                    String subStr = command[1];
                    String tempString = sb.toString();
                    if (tempString.contains(subStr)) {
                        tempString = tempString.replaceFirst(Pattern.quote(subStr), "");
                        sb = new StringBuilder(tempString);
                        StringBuilder subStrReversed = new StringBuilder(subStr);
                        subStrReversed.reverse();
                        sb.append(subStrReversed);
                        System.out.println(sb);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String oldString = command[1];
                    String newString = command[2];
                    sb = new StringBuilder(sb.toString().replaceAll(oldString, newString));
                    System.out.println(sb);
                    break;
            }
            command = scanner.nextLine().split(":\\|:");
        }
        System.out.printf("You have a new text message: %s", sb);
    }
}
