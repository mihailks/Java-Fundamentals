package P05ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int totalBitcoins = 0;

        String[] dungeon = scanner.nextLine().split("\\|");

        for (int i = 0; i < dungeon.length; i++) {
            String[] command = dungeon[i].split(" ");
            switch (command[0]){
                case "potion":
                    int potionSize = Integer.parseInt(command[1]);

                    if (health+potionSize>=100){
                        System.out.printf("You healed for %d hp.\n",100-health);
                    } else {
                        System.out.printf("You healed for %d hp.\n",potionSize);
                    }
                    health+=potionSize;
                    if (health>100){
                        health=100;
                    }
                    System.out.printf("Current health: %d hp.\n",health);
                    break;
                case "chest":
                    int bitcoin = Integer.parseInt(command[1]);
                    totalBitcoins+=bitcoin;
                    System.out.printf("You found %d bitcoins.\n",bitcoin);
                    break;
                default:
                    String name = command[0];
                    int attack = Integer.parseInt(command[1]);
                    health-=attack;
                    if (health<=0){
                        System.out.printf("You died! Killed by %s.\n",name);
                        System.out.printf("Best room: %d",i+1);
                        return;
                    } else {
                        System.out.printf("You slayed %s.\n",name);
                    }
            }
        }
        System.out.println("You've made it!");
        System.out.println("Bitcoins: " + totalBitcoins);
        System.out.println("Health: " + health);

    }
}