package ArraysMoreExercise;

import java.util.Scanner;

public class P05KaminoFactory_REV_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int iCounter = 1;
        int[] currentDNA = new int[n];
        while (!input.equals("Clone them!")) {
            for (int i = 0; i < input.length() - 1; i++) {
                if ((input.charAt(i)=='1')) {
                    currentDNA[i]= 1;
                } else if (input.charAt(i)=='0'){
                    currentDNA[i]= 0;
                }
            }
            input = scanner.nextLine();

        }
        for (int i:currentDNA){
            System.out.print(currentDNA[i] + " ");
        }
    }
}