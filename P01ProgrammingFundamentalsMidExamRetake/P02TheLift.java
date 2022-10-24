package P01ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.Scanner;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPeople = Integer.parseInt(scanner.nextLine());

        int[] liftArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int peopleInStart = 0;
        for (int i = 0; i < liftArr.length; i++) {
            peopleInStart+=liftArr[i];
        }
        int maxPeopleTrain = liftArr.length * 4;
        maxPeopleTrain-=peopleInStart;

        if (maxPeopleTrain == totalPeople) {
            Arrays.fill(liftArr, 4);
            System.out.println(Arrays.toString(liftArr).replaceAll("[\\[\\]\\,]", ""));
        } else if (maxPeopleTrain < totalPeople) {

            System.out.printf("There isn't enough space! %d people in a queue!\n", totalPeople - maxPeopleTrain);
            Arrays.fill(liftArr, 4);
            System.out.println(Arrays.toString(liftArr).replaceAll("[\\[\\]\\,]", ""));
        } else {
            boolean noMorePeople = false;
            for (int i = 0; i < liftArr.length; i++) {

                while (liftArr[i]<4){
                    if (totalPeople==0){
                        noMorePeople=true;
                        break;
                    }
                    liftArr[i]++;
                    totalPeople--;
                }
                if (noMorePeople){
                    break;
                }
            }
            System.out.println("The lift has empty spots!");
            System.out.println(Arrays.toString(liftArr).replaceAll("[\\[\\]\\,]", ""));
        }
    }
}
