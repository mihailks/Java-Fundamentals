package PF02ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        StringBuilder sb = new StringBuilder(stops);

        String[] command = scanner.nextLine().split(":");
        while (!command[0].equals("Travel")) {

            switch (command[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(command[1]);
                    String toAdd = command[2];
                    if (index >= 0 && index <= sb.length()) {
                        sb.insert(index, toAdd);
                    }
                    System.out.println(sb);
                    break;
                case "Remove Stop":
                    int startIndex = Math.min(Integer.parseInt(command[1]),Integer.parseInt(command[2]));
                    int endIndex = Math.max(Integer.parseInt(command[1]),Integer.parseInt(command[2]));
                    if (startIndex >= 0 && startIndex < sb.length()) {
                        if (endIndex >= 0 && endIndex < sb.length()) {
                            sb.delete(startIndex, endIndex+1);
                        }
                    }
                    System.out.println(sb);
                    break;
                case "Switch":
                    String oldString = command[1];
                    String newString = command[2];
                    String tempStr = sb.toString();
                    if (tempStr.contains(oldString)) {
                        tempStr = tempStr.replaceAll(oldString, newString);
                    }
                    sb = new StringBuilder(tempStr);
                    System.out.println(sb);
                    break;
            }
            command = scanner.nextLine().split(":");
        }
        System.out.printf("Ready for world tour! Planned stops: %s", sb);
    }
}
