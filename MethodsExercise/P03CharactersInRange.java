package MethodsExercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        if (first>second){
            char temp=first;
            first=second;
            second=temp;
        }
        printRange(first,second);
    }

    public static void printRange(char first, char second) {
        for (int i = first+1; i < second; i++) {
            System.out.printf("%c ",i);
        }
    }
}
