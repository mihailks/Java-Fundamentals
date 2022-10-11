package ArraysExercise;

import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        String[] chest = scanner.nextLine().split("\\|");

        String[] loot = scanner.nextLine().split(" ");
        String temp = "";
        while (!loot[0].equals("Yohoho!")) {
            switch (loot[0]) {
                case "Loot":
                    boolean sameItem = false;
                    int indexSameItem = 0;
                    for (int i = 0; i < chest.length; i++) {
                        for (int j = 1; j < loot.length; j++) {
                            if (chest[i].equals(loot[j])) {
                                sameItem = true;
                                indexSameItem = i;
                                break;
                            }
                        }
                    }
                    if (sameItem) {
                        String[] tempChest = new String[chest.length - 1];
                        for (int i = 0; i < chest.length - 1; i++) {
                            if (i != indexSameItem) {
                                tempChest[i] = chest[i];
                            }
                        }
                        chest = tempChest;
                    }
                    String[] tempChest = new String[chest.length + loot.length];
                    for (int i = loot.length - 1; i > 0; i--) {
                        tempChest[i] = loot[i];
                    }
                    for (int i = 0; i < chest.length; i++) {
                        tempChest[i + loot.length - 1] = chest[i];
                    }
                    break;

                case "Drop":
                    if (Integer.parseInt(loot[1]) > chest.length) {
                        continue;
                    } else {
                        temp = chest[Integer.parseInt(loot[1])];
                        chest[Integer.parseInt(loot[1])] = chest[chest.length - 1];
                        chest[chest.length - 1] = temp;
                    }
                    break;
                case "Steal":
                    if (Integer.parseInt(loot[1]) > chest.length) {
                        loot[1] = String.valueOf(chest.length);
                    }
                    int length = chest.length - Integer.parseInt(loot[1]);
                    for (int i = length; i < chest.length; i++) {
                        if (i == chest.length - 1) {
                            System.out.print(chest[i]);
                        } else {
                            System.out.print(chest[i] + ", ");
                        }
                    }
                    break;
            }
            loot = scanner.nextLine().split(" ");
        }


        str.append(chest[0]);
        for (int j = 1; j < chest.length; j++) {
            str.append(", ").append(chest[j]);
        }
        System.out.println(str);
    }
}
