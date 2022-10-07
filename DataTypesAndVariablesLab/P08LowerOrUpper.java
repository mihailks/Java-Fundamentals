package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);

        boolean check = Character.isLowerCase(a);
        if (check){
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
