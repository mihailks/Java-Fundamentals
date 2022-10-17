package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNumbers = scanner.nextLine();

        List<Integer> numbersList = Arrays.stream(inputNumbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        

    }
}
