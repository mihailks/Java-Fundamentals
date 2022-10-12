package ArraysExercise;

import javax.swing.*;
import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        String[] chest = scanner.nextLine().split("\\|");

        String[] loot = scanner.nextLine().split(" ");

        while (!loot[0].equals("Yohoho!")) {
            switch (loot[0]) {
                case "Loot":
                    boolean sameItem = false;
                    int indexSameItem = 0;
                    for (int i = 0; i < chest.length; i++) {
                        for (int j = 1; j < loot.length; j++) {
                            if (chest[i].equals(loot[j])) {
                                sameItem = true;
                                indexSameItem = j;
                                break;
                            }
                        }
                        if (sameItem) {
                            break;
                        }
                    }
                    String[] tempChest = new String[loot.length - 2];
                    if (sameItem) {
                        for (int i = 1, j = 0; i < loot.length; i++) {
                            if (i != indexSameItem) {
                                tempChest[j++] = loot[i];
                            }
                        }
                        loot = tempChest;
                    }
                    tempChest = new String[chest.length + loot.length];
                    for (int i = loot.length - 1; i >= 0; i--) {
                        tempChest[i] = loot[i];
                    }
                    for (int i = loot.length; i < tempChest.length; i++) {
                        tempChest[i] = chest[i - loot.length];
                    }
                    chest = tempChest;


                    break;
                case "Drop":
                    if (Integer.parseInt(loot[1]) >= chest.length || Integer.parseInt(loot[1]) < 0) {
                        loot = scanner.nextLine().split(" ");
                        continue;
                    } else {
                        String temp = "";
                        tempChest = new String[chest.length];
                        temp = chest[Integer.parseInt(loot[1])];
                        for (int i = 0, j = 0; i < chest.length; i++) {
                            if (i != Integer.parseInt(loot[1])) {
                                tempChest[j++] = chest[i];
                            }
                        }
                        tempChest[tempChest.length-1]=temp;
                        chest=tempChest;
//                        String temp = "";
//                        temp = chest[Integer.parseInt(loot[1])];
//                        chest[Integer.parseInt(loot[1])] = chest[chest.length - 1];
//                        chest[chest.length - 1] = temp;
                    }
                    break;
                case "Steal":
                    if (Integer.parseInt(loot[1]) > chest.length) {
                        loot[1] = String.valueOf(chest.length);
                    }
                    int length = chest.length - Integer.parseInt(loot[1]);
                    String[] finalChest = new String[chest.length-length];
                    for (int i = length; i < chest.length; i++) {
                        if (i == chest.length - 1) {
                            System.out.print(chest[i]);
                        } else {
                            System.out.print(chest[i] + ", ");
                        }
                        finalChest[i-length]=chest[i];
                    }
                    chest=finalChest;
                    break;
            }
            loot = scanner.nextLine().split(" ");
        }
        System.out.println();
        String treasureCount = String.join("", chest);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
        double averageTreasure = (1.0 * charCounter / chest.length);
        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
