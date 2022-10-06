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
                    String[] newLoot = new String[chest.length+ loot.length];
                    boolean same = false;
                    for (int i = 0; i < newLoot.length; i++) {
                        newLoot[i]=loot[i];
                    }
                    for (int i = loot.length; i < newLoot.length; i++) {

                        newLoot[i]=chest[chest.length+i];
                    }
                    chest=newLoot;
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
