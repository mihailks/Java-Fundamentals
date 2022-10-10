package ArraysMoreExercise;

import java.util.Scanner;

public class P05KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;
        int maxSum=0;
        int firstIndex=0;
        int iCounter= 1;
        int sampleNumber=0;
        while (!input.equals("Clone them!")){
            for (int i = 0; i < input.length()-1; i++) {
                if (Character.isDigit(input.charAt(i))){

                    sum+=input.charAt(i);
                    if (input.charAt(i)==1){
                        sum++;
                    }

                    if (input.charAt(i)==1 && input.charAt(i+1)==1){
                        iCounter++;
                    } else {

                    }
                }
            }
            if (sum>maxSum){
                maxSum=sum;
                sum=0;
            }
            input = scanner.nextLine();
        }
        String output = "";
        System.out.printf("Best DNA sample %d with sum: ",sampleNumber);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='!'){
                output+=" ";
            }else {
                output+=input.charAt(i);
            }
        }
        System.out.printf("%s.",output);
    }
}
