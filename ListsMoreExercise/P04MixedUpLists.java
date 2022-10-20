package ListsMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersListOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> numbersListTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        int[] range = new int[2];

        if (numbersListOne.size() > numbersListTwo.size()) {
            range[0] = numbersListOne.get(numbersListOne.size() - 2);
            range[1] = numbersListOne.get(numbersListOne.size() - 1);
            numbersListOne.remove(numbersListOne.size() - 1);
            numbersListOne.remove(numbersListOne.size() - 1);
        } else {
            range[0] = numbersListTwo.get(0);
            range[1] = numbersListTwo.get(1);
            numbersListTwo.remove(numbersListTwo.get(0));
            numbersListTwo.remove(numbersListTwo.get(0));
        }

        for (int i = 0; i < numbersListOne.size(); i++) {
            result.add(numbersListOne.get(i));
            result.add(numbersListTwo.get(numbersListTwo.size() - 1 - i));
        }
        int min = Math.min(range[0], range[1]);
        int max = Math.max(range[0], range[1]);
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) <= min || result.get(i) >= max) {
                result.remove(i);
                i=-1;
            }
        }
        Collections.sort(result);
        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));


    }
}
