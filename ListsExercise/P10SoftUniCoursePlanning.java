package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> lessonsList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine().replaceAll(":", " ");
        String[] changes = input.split(" ");

        while (!changes[0].equals("course") && !changes[1].equals("start")) {

            switch (changes[0]) {
                case "Add":
                    if (!lessonsList.contains(changes[1])) {
                        lessonsList.add(changes[1]);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(changes[2]);
                    if (!lessonsList.contains(changes[1])) {
                        lessonsList.add(index, changes[1]);
                    }
                    break;
                case "Remove":
                    if (lessonsList.contains(changes[1])) {
                        lessonsList.remove(changes[1]);
                    }
                    if (lessonsList.contains(changes[1] + "-Exercise")) {
                        lessonsList.remove(changes[1] + "-Exercise");
                    }
                    break;
                case "Swap":
                    if (lessonsList.contains(changes[1]) && lessonsList.contains(changes[2])) {
                        int swapIndexFirst = lessonsList.indexOf(changes[1]);
                        int swapIndexSecond = lessonsList.indexOf(changes[2]);

                        lessonsList.set(swapIndexFirst, changes[2]);
                        lessonsList.set(swapIndexSecond, changes[1]);


                        String exerciseOne = changes[1] + "-Exercise";
                        String exerciseTwo = changes[2] + "-Exercise";

                        if (lessonsList.contains(exerciseOne)) {
                            lessonsList.remove(lessonsList.indexOf(exerciseOne));
                            lessonsList.add(lessonsList.indexOf(changes[1]) + 1, exerciseOne);
                        }
                        if (lessonsList.contains(exerciseTwo)) {
                            lessonsList.remove(lessonsList.indexOf(exerciseTwo));
                            lessonsList.add(lessonsList.indexOf(changes[2]) + 1, exerciseTwo);
                        }
                    }
                    break;
                case "Exercise":
                    if (lessonsList.contains(changes[1]) && !lessonsList.contains(changes[1] + "-Exercise")) {
                        int lessonIndex = lessonsList.indexOf(changes[1]);
                        lessonsList.add(lessonIndex + 1, changes[1] + "-Exercise");
                    } else if (!lessonsList.contains(changes[1])) {
                        lessonsList.add(changes[1]);
                        lessonsList.add(changes[1] + "-Exercise");
                        break;
                    }
                    break;
            }
            input = scanner.nextLine().replaceAll(":", " ");
            changes = input.split(" ");

        }

        for (int i = 0; i < lessonsList.size(); i++) {
            System.out.println(i + 1 + "." + lessonsList.get(i));
        }
    }
}
