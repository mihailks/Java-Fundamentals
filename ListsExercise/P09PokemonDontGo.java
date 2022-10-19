package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;


        while (numbersList.size() > 0) {

            int inputIndex = Integer.parseInt(scanner.nextLine());

            if (inputIndex >= 0 && inputIndex <= numbersList.size() - 1) {
                int currentValue = numbersList.get(inputIndex);
                sum += currentValue;
                numbersList.remove(inputIndex);
                modifyNumbersList(numbersList, currentValue);

            } else if (inputIndex < 0) {
                sum += numbersList.get(0);
                int first = numbersList.get(0);
                numbersList.set(0, numbersList.get(numbersList.size() - 1));
                modifyNumbersList(numbersList, first);

            } else if (inputIndex > numbersList.size()-1) {
                sum += numbersList.get(numbersList.size() - 1);
                int last = numbersList.get(numbersList.size()-1);
                numbersList.set(numbersList.size() - 1, numbersList.get(0));
                modifyNumbersList(numbersList, last);
            }
        }
        System.out.println(sum);
    }
    public static void modifyNumbersList(List<Integer> numbersList, int currentValue) {
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) <= currentValue) {
                numbersList.set(i, numbersList.get(i) + currentValue);
            } else {
                numbersList.set(i, numbersList.get(i) - currentValue);
            }
        }
    }
}
