package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> peopleInWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] numberOfPeople = scanner.nextLine().split(" ");


        while (!numberOfPeople[0].equals("end")) {
            if (numberOfPeople[0].equals("Add")) {
                peopleInWagons.add(Integer.parseInt(numberOfPeople[1]));


            } else {

                int peopleToAdd = Integer.parseInt(numberOfPeople[0]);

                for (int i = 0; i < peopleInWagons.size(); i++) {
                    if (peopleInWagons.get(i) - peopleToAdd <= 0) {
                        peopleInWagons.set(i, peopleInWagons.get(i) + peopleToAdd);
                    }
                }

            }
            numberOfPeople = scanner.nextLine().split(" ");
        }

        System.out.println(peopleInWagons.toString().replaceAll("[\\[\\],]",""));
    }
}
