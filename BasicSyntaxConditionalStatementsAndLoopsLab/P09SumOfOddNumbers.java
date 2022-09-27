package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = 1; i <=2*n ; i+=2) {
            sum+=i;
            System.out.println(i);
        }
        System.out.println("Sum: " + sum);
    }
}
