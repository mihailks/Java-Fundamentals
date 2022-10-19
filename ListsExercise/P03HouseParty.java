package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> guestsList = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {

            String[] names = scanner.nextLine().split(" ");

            if (!guestsList.contains(names[0]) && names[2].equals("going!")) {
                guestsList.add(names[0]);
            } else if (!guestsList.contains(names[0]) && names[2].equals("not")){
                System.out.println(names[0] + " is not in the list!");
            } else if (guestsList.contains(names[0]) && names[2].equals("not")){
                guestsList.remove(names[0]);
            } else if (guestsList.contains(names[0]) && names[2].equals("going!")){
                System.out.println(names[0] + " is already in the list!");
            }
        }
        for (int i = 0; i < guestsList.size(); i++) {
            System.out.println(guestsList.get(i));
        }
    }
}
