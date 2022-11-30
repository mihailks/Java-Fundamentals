package PF04ProgrammingFundamentalsFinalExam;

import java.util.*;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] heroData = scanner.nextLine().split(" ");
            String heroName = heroData[0];
            int heroHP = Integer.parseInt(heroData[1]);
            int heroMana = Integer.parseInt(heroData[2]);
            heroMap.putIfAbsent(heroName, new ArrayList<>());
            heroMap.get(heroName).add(heroHP);
            heroMap.get(heroName).add(heroMana);
        }

        String[] input = scanner.nextLine().split(" - ");
        while (!input[0].equals("End")) {

            String command = input[0];
            String heroName = input[1];

            switch (command) {
                case "CastSpell":
                    int manaNeed = Integer.parseInt(input[2]);
                    String spellName = input[3];

                    if (heroMap.get(heroName).get(1) >= manaNeed) {
                        heroMap.get(heroName).set(1, heroMap.get(heroName).get(1) - manaNeed);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n"
                                , heroName, spellName, heroMap.get(heroName).get(1));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n"
                                , heroName, spellName);
                    }
                    break;

                case "TakeDamage":
                    int damage = Integer.parseInt(input[2]);
                    String attackerName = input[3];
                    int currentHP = heroMap.get(heroName).get(0);
                    if (currentHP > damage) {
                        heroMap.get(heroName).set(0, currentHP - damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n"
                                , heroName, damage, attackerName, heroMap.get(heroName).get(0));
                    } else {
                        heroMap.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n"
                                , heroName, attackerName);
                    }
                    break;

                case "Recharge":
                    int rechargeMana = Integer.parseInt(input[2]);
                    int currentMana = heroMap.get(heroName).get(1);
                    int recovered = 0;
                    if (currentMana + rechargeMana > 200) {
                        recovered = 200 - currentMana;
                        currentMana = 200;
                    } else {
                        currentMana += rechargeMana;
                        recovered = rechargeMana;
                    }
                    heroMap.get(heroName).set(1, currentMana);
                    System.out.printf("%s recharged for %d MP!\n"
                            , heroName, recovered);
                    break;

                case "Heal":
                    int rechargeHP = Integer.parseInt(input[2]);
                    currentHP = heroMap.get(heroName).get(0);
                    if (currentHP + rechargeHP > 100) {
                        recovered = 100 - currentHP;
                        currentHP = 100;
                    } else {
                        currentHP += rechargeHP;
                        recovered = rechargeHP;
                    }
                    heroMap.get(heroName).set(0, currentHP);

                    System.out.printf("%s healed for %d HP!\n",
                            heroName, recovered);
                    break;
            }
            input = scanner.nextLine().split(" - ");
        }

        for (Map.Entry<String, List<Integer>> entry : heroMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("HP: " + entry.getValue().get(0));
            System.out.println("MP: " + entry.getValue().get(1));
        }
    }
}
