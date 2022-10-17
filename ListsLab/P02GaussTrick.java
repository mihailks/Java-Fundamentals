package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNumbers = scanner.nextLine();

        List<Integer> numbersList = Arrays.stream(inputNumbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = numbersList.size();
        for (int i = 0; i < size / 2; i++) {
            int temp1 = numbersList.get(i);
            int temp2 = numbersList.get(numbersList.size() - 1);
            numbersList.set(i, (numbersList.get(i) + numbersList.get(numbersList.size() - 1)));
            numbersList.remove(numbersList.size() - 1);
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));
    }
}
