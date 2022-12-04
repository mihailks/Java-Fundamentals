import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] command = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        while (!command[0].equals("Finish")) {

            switch (command[0]) {
                case "Replace":
                    String oldChar = command[1];
                    String newChar = command[2];
                    input = input.replace(oldChar, newChar);
                    System.out.println(input);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);

                    if (startIndex >= 0 && endIndex < input.length()) {
                        sb = new StringBuilder(input);
                        sb = new StringBuilder(sb.delete(startIndex, endIndex+1));
                        input = sb.toString();
                        System.out.println(input);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    switch (command[1]) {
                        case "Upper":
                            input = input.toUpperCase();
                            System.out.println(input);
                            break;
                        case "Lower":
                            input = input.toLowerCase();
                            System.out.println(input);
                            break;
                    }

                    break;
                case "Check":
                    String checkStr = command[1];
                    if (input.contains(checkStr)) {
                        System.out.println("Message contains " + checkStr);
                    }else {
                        System.out.println("Message doesn't contain " + checkStr);
                    }
                    break;
                case "Sum":
                    startIndex = Integer.parseInt(command[1]);
                    endIndex = Integer.parseInt(command[2]);
                    int sumChar = 0;
                    if (startIndex >= 0 && endIndex < input.length()) {
                        String subStr = input.substring(startIndex,endIndex+1);
                        for (int i = 0; i < subStr.length(); i++) {
                            sumChar+=subStr.charAt(i);
                        }
                        System.out.println(sumChar);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }


            command = scanner.nextLine().split(" ");
        }

    }
}
