package PF05ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawKey = scanner.nextLine();

        String command = scanner.nextLine();
        StringBuilder sb = new StringBuilder(rawKey);
        while (!command.equals("Generate")) {

            if (command.contains("Contains")) {
                String partStr = command.split(">>>")[1];
                if (sb.toString().contains(partStr)){
                    System.out.printf("%s contains %s\n",sb,partStr);
                }else {
                    System.out.println("Substring not found!");
                }
            }
            if (command.contains("Flip")) {
                String cases = command.split(">>>")[1];
                int startIndex = Integer.parseInt(command.split(">>>")[2]);
                int endIndex = Integer.parseInt(command.split(">>>")[3]);

                StringBuilder temp = new StringBuilder();
                for (int i = 0; i < sb.length(); i++) {
                    if (i >= startIndex && i < endIndex) {
                        switch (cases) {
                            case "Upper":
                                temp.append(Character.toUpperCase(sb.charAt(i)));
                                break;
                            case "Lower":
                                temp.append(Character.toLowerCase(sb.charAt(i)));
                                break;
                        }
                    } else {
                        temp.append(sb.charAt(i));
                    }
                }
                sb=temp;
                System.out.println(sb);
            }
            if (command.contains("Slice")){
                int startIndex = Integer.parseInt(command.split(">>>")[1]);
                int endIndex = Integer.parseInt(command.split(">>>")[2]);
                sb.delete(startIndex,endIndex);
                System.out.println(sb);
            }


            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + sb);
    }
}
