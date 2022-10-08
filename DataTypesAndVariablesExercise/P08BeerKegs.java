package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String topModel = "";
        double volume = 0;
        double maxVolume = 0;

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            volume=Math.PI * radius*radius*height;
            if (volume>maxVolume){
                maxVolume=volume;
                topModel=model;
            }
        }
        System.out.println(topModel);
    }
}
