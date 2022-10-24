package P04ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> neighborhoodList = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");

        int length = neighborhoodList.size();
        int currentJump = 0;
        while (!command[0].equals("Love!")) {
            int jumpLength = Integer.parseInt(command[1]);
            currentJump += jumpLength;
            if (currentJump >= length) {
                currentJump = 0;
            }

            int currentHouse = neighborhoodList.get(currentJump);
            if (currentHouse == 2) {
                System.out.printf("Place %d has Valentine's day.\n", currentJump);
            } else if (currentHouse <= 0) {
                System.out.printf("Place %d already had Valentine's day.\n", currentJump);
            }
            neighborhoodList.set(currentJump, currentHouse - 2);

            command = scanner.nextLine().split(" ");
        }
        int counter = 0;
        for (int i = 0; i < neighborhoodList.size(); i++) {
            if (neighborhoodList.get(i) > 0) {
                counter++;
            }
        }
        System.out.printf("Cupid's last position was %d.\n", currentJump);
        if (counter == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", counter);
        }
    }
}
