package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean closed = false;
        boolean open = false;
        int counterOpen = 0;
        int counterClose = 0;
        int totalCounter=0;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (input.charAt(0)=='('|| input.charAt(0)==')'){
                totalCounter++;
            }
            if (input.charAt(0) == '(') {
                open = true;
                counterOpen++;
            }

            if (input.charAt(0) == ')' && open) {
                closed = true;
                counterClose++;
                open = false;
            }
        }
        if (closed && counterOpen + counterClose ==totalCounter && counterOpen==counterClose) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
