package Others;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestCommonEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> first = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        List<String> second = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());



        int shorterArr = Math.min(first.size(), second.size());
        int counterLeft = 0;
        int counterRight = 0;

        for (int i = 0; i < shorterArr; i++) {
            if (first.get(i).equals(second.get(i))) {
                counterLeft++;
            } else {
                break;
            }
        }
        Collections.reverse(first);
        Collections.reverse(second);

        for (int i = 0; i < shorterArr; i++) {
            if (first.get(i).equals(second.get(i))) {
                counterRight++;
            } else {
                break;
            }
        }
        System.out.println(Math.max(counterLeft, counterRight));
    }
}
