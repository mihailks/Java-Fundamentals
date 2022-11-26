package TextProcessingMoreExercise;

import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            StringBuilder name = new StringBuilder();
            StringBuilder age = new StringBuilder();
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j)=='@'){
                    j++;
                    while (input.charAt(j)!='|'){
                        name.append(input.charAt(j));
                       j++;
                    }
                }
                if (input.charAt(j)=='#'){
                    j++;
                    while (input.charAt(j)!='*'){
                        age.append(input.charAt(j));
                        j++;
                    }
                }
            }
            System.out.printf("%s is %s years old.\n",name,age);
        }
    }
}
