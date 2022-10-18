package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumbers = scanner.nextLine();
        String secondNumbers = scanner.nextLine();

        List<Integer> firstList = Arrays.stream(firstNumbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(secondNumbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> mergedList = new ArrayList<>();

        int firstListSize = firstList.size();
        int secondListSize = secondList.size();
        int minSize = Math.min(firstListSize, secondListSize);

        for (int i = 0; i < minSize; i++) {
            int currentFirst = firstList.get(i);
            int currentSecond = secondList.get(i);
            mergedList.add(currentFirst);
            mergedList.add(currentSecond);
        }
        if (firstListSize > secondListSize) {
            mergedList.addAll(firstList.subList(minSize, firstList.size()));
        } else {
            mergedList.addAll(secondList.subList(minSize, secondList.size()));
        }
        System.out.println(mergedList.toString().replaceAll("[\\[\\],]", ""));
    }
}
