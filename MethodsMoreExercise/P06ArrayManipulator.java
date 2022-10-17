package MethodsMoreExercise;

import java.util.*;

public class P06ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "exchange":
                    int index = Integer.parseInt(command[1]);
                    if (index < 0 || index > myArr.length - 1) {
                        System.out.println("Invalid index");
                        command = scanner.nextLine().split(" ");
                        continue;
                    } else {
                        myArr = exchange(index, myArr);
                    }
                    break;


                case "max":
                    switch (command[1]) {
                        case "even":
                            maxEven(myArr);
                            break;
                        case "odd":
                            maxOdd(myArr);
                            break;

                    }
                    break;

                case "min":
                    switch (command[1]) {
                        case "even":
                            minEven(myArr);
                            break;
                        case "odd":
                            minOdd(myArr);
                            break;
                    }
                    break;

                case "first":
                    index = Integer.parseInt(command[1]);
                    if (index < 0 || index > myArr.length) {
                        System.out.println("Invalid count");
                        command = scanner.nextLine().split(" ");
                        continue;
                    } else {
                        switch (command[2]) {
                            case "even":

                                firstEven(myArr, index);
                                break;
                            case "odd":
                                firstOdd(myArr, index);
                                break;
                        }
                        break;
                    }
                case "last":
                    index = Integer.parseInt(command[1]);
                    if (index < 0 || index > myArr.length) {
                        System.out.println("Invalid count");
                        command = scanner.nextLine().split(" ");
                        continue;
                    } else {
                        switch (command[2]) {
                            case "even":
                                lastEven(myArr, index);
                                break;
                            case "odd":
                                lastOdd(myArr, index);
                                break;
                        }
                        break;

                    }
            }
            command = scanner.nextLine().split(" ");
        }
        System.out.println(Arrays.toString(myArr));
    }

    public static int[] exchange(int index, int[] myArr) {

        int[] temp = new int[myArr.length];
        int counter = 0;
        for (int i = index + 1; i < myArr.length; i++) {
            temp[counter] = myArr[i];
            counter++;
        }

        for (int i = 0; i < index + 1; i++) {
            temp[counter] = myArr[i];
            counter++;
        }
        myArr = temp;
        return myArr;
    }

    private static void maxEven(int[] myArr) {
        int maxIndex = 0;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 == 0) {
                if (myArr[i] >= maxElement) {
                    maxElement = myArr[i];
                    maxIndex = i;
                }
            }
        }
        if (maxElement == Integer.MIN_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(maxIndex);
        }
    }

    private static void minEven(int[] myArr) {
        int minIndex = 0;
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 == 0) {
                if (myArr[i] <= minElement) {
                    minElement = myArr[i];
                    minIndex = i;
                }
            }
        }
        if (minElement == Integer.MAX_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(minIndex);
        }
    }

    private static void maxOdd(int[] myArr) {
        int maxIndex = 0;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 != 0) {
                if (myArr[i] >= maxElement) {
                    maxElement = myArr[i];
                    maxIndex = i;
                }
            }
        }
        if (maxElement == Integer.MIN_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(maxIndex);
        }
    }

    private static void minOdd(int[] myArr) {
        int minIndex = 0;
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 != 0) {
                if (myArr[i] <= minElement) {
                    minElement = myArr[i];
                    minIndex = i;
                }
            }
        }
        if (minElement == Integer.MAX_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(minIndex);
        }
    }

    public static void firstEven(int[] myArr, int count) {
        int counter = 0;
        List<Integer> firstEven = new ArrayList<>();
        for (int i = 0; i < myArr.length; i++) {

            if (myArr[i] % 2 == 0) {
                counter++;
                firstEven.add(myArr[i]);
            }
            if (counter >= count) {
                break;
            }
        }
        System.out.println(firstEven);
    }

    public static void firstOdd(int[] myArr, int count) {
        int counter = 0;
        List<Integer> firstOdd = new ArrayList<>();
        for (int i = 0; i < myArr.length; i++) {

            if (myArr[i] % 2 != 0) {
                counter++;
                firstOdd.add(myArr[i]);
            }
            if (counter >= count) {
                break;
            }
        }
        System.out.println(firstOdd);
    }

    public static void lastEven(int[] myArr, int count) {
        int counter = 0;
        List<Integer> lastEven = new ArrayList<>();
        for (int i = myArr.length - 1; i >= 0; i--) {

            if (myArr[i] % 2 == 0) {
                counter++;
                lastEven.add(myArr[i]);
            }
            if (counter >= count) {
                break;
            }
        }
        Collections.reverse(lastEven);
        System.out.println(lastEven);
    }

    public static void lastOdd(int[] myArr, int count) {
        int counter = 0;
        List<Integer> lastOdd = new ArrayList<>();
        for (int i = myArr.length - 1; i >= 0; i--) {

            if (myArr[i] % 2 != 0) {
                counter++;
                lastOdd.add(myArr[i]);
            }
            if (counter >= count) {
                break;
            }
        }
        Collections.reverse(lastOdd);
        System.out.println(lastOdd);
    }
}
