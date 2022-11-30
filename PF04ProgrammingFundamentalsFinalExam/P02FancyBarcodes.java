package PF04ProgrammingFundamentalsFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);
            StringBuilder digits = new StringBuilder();
            if (matcher.find()) {
                String barcode = matcher.group();
                for (int j = 0; j < barcode.length(); j++) {
                    if (Character.isDigit(barcode.charAt(j))) {
                        digits.append(barcode.charAt(j));
                    }
                }
            } else {
                System.out.println("Invalid barcode");
                continue;
            }
            if (digits.toString().isEmpty()) {
                System.out.println("Product group: 00");
            } else {
                System.out.println("Product group: " + digits);
            }
        }
    }
}
