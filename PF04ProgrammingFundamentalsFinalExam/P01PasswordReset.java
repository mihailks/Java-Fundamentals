package PF04ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawPass = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            switch (input.split(" ")[0]) {
                case "TakeOdd":
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < rawPass.length(); i++) {
                        if (i % 2 != 0) {
                            sb.append(rawPass.charAt(i));
                        }
                    }
                    rawPass=sb.toString();
                    System.out.println(rawPass);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(input.split(" ")[1]);
                    int endIndex = Integer.parseInt(input.split(" ")[2]) + startIndex;
                    String strToRemove = rawPass.substring(startIndex,endIndex);
                    rawPass = rawPass.replaceFirst(strToRemove, "");
                    System.out.println(rawPass);
                    break;
                case "Substitute":
                    String toRemove = input.split(" ")[1];
                    String substitute = input.split(" ")[2];

                    if (rawPass.toString().contains(toRemove)) {
                        rawPass = rawPass.replaceAll(toRemove,substitute);
                        System.out.println(rawPass);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + rawPass);
    }
}
