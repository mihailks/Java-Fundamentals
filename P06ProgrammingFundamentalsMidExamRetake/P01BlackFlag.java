package P06ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int plunderPerDay = Integer.parseInt(scanner.nextLine());
        double expected = Double.parseDouble(scanner.nextLine());

        double currentPlunder = 0;

        for (int i = 1; i <= days; i++) {
            currentPlunder+=plunderPerDay;
            if (i%3==0){
                currentPlunder+=plunderPerDay*0.5;
            }
            if (i%5==0){
                currentPlunder*=0.7;
            }
        }
        if (currentPlunder>=expected){
            System.out.printf("Ahoy! %.2f plunder gained.\n",currentPlunder);
        }else {
            System.out.printf("Collected only %.2f%% of the plunder.",currentPlunder/expected*100);
        }
    }
}
