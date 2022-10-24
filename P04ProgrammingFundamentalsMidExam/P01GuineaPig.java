package P04ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKg = Double.parseDouble(scanner.nextLine());
        double hayKg = Double.parseDouble(scanner.nextLine());
        double coverKg = Double.parseDouble(scanner.nextLine());
        double weightKg = Double.parseDouble(scanner.nextLine());

        double foodGr = foodKg*1000;
        double hayGr = hayKg*1000;
        double coverGr = coverKg*1000;
        double weightGr = weightKg*1000;

        boolean hasResources = true;
        for (int i = 1; i <= 30 ; i++) {
            foodGr-=300;
            if (foodGr<=0){
                hasResources=false;
                break;
            }
            if (i%2==0){
                hayGr-=0.05*foodGr;
            }
            if (hayGr<=0){
                hasResources=false;
                break;
            }
            if (i%3==0){
                coverGr-=weightGr/3;
            }
            if (coverGr<=0){
                hasResources=false;
                break;
            }
        }

        if (hasResources){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodGr/1000,hayGr/1000,coverGr/1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }

    }
}
