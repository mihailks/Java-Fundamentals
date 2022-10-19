package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("3:1")) {

            switch (command[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(command[1]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    int endIndex = Integer.parseInt(command[2]);
                    if (endIndex > inputList.size() - 1) {
                        endIndex = inputList.size() - 1;
                    }

                    if (startIndex <= inputList.size() - 1 && endIndex >= 0 && startIndex < endIndex) {

                        String merge = "";
                        for (int i = startIndex; i <= endIndex; i++) {
                            merge += inputList.get(i);
                        }
                        for (int i = startIndex; i <= endIndex; i++) {
                            inputList.remove(startIndex);
                        }
                        inputList.add(startIndex, merge);
                    }
                    break;

                case "divide":
                    int index = Integer.parseInt(command[1]);
                    int partitions = Integer.parseInt(command[2]);

                    String elementForDivide = inputList.get(index);
                    inputList.remove(index);

                    int partSize = elementForDivide.length() / partitions;

                    int beginIndexOfText = 0;
                    for (int part = 1; part < partitions; part++) {
                        inputList.add(index, elementForDivide.substring(beginIndexOfText, beginIndexOfText + partSize));
                        index++;
                        beginIndexOfText += partSize;
                    }
                    inputList.add(index, elementForDivide.substring(beginIndexOfText));
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
    }
}
