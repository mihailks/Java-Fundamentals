package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNumbers = scanner.nextLine();

        List<Double> numberList = Arrays.stream(inputNumbers.split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numberList.size() - 1; i++) {
            if (numberList.get(i).equals(numberList.get(i + 1))) {
                numberList.set(i, numberList.get(i) + numberList.get(i + 1));
                numberList.remove(i + 1);
                i = -1;
            }
        }
        String output = joinElementByDelimiter(numberList, " ");
        System.out.println(output);
    }

    private static String joinElementByDelimiter(List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items) {
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }
        return output;
    }
}
