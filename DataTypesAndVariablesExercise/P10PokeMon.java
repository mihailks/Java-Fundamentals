package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokeCounter=0;
        int pokeOriginal=pokePower;

        while (pokePower>=distance){
            pokePower-=distance;
            pokeCounter++;
            if (pokePower==pokeOriginal/2&&exhaustionFactor!=0){
                pokePower/=exhaustionFactor;
            }


        }
        System.out.println(pokePower);
        System.out.println(pokeCounter);
    }
}
