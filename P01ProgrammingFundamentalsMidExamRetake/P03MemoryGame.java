package P01ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> board = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        int movesCounter = 0;
        String[] userInput = scanner.nextLine().split(" ");

        while (!userInput[0].equals("end")) {
            int indexOne = Integer.parseInt(userInput[0]);
            int indexTwo = Integer.parseInt(userInput[1]);
            movesCounter++;


            if (indexOne == indexTwo || indexOne < 0 || indexTwo < 0
                    || indexOne >= board.size() || indexTwo >= board.size()) {

                board.add(board.size()/2,"-" + movesCounter + "a");
                board.add(board.size()/2,"-" + movesCounter + "a");

                System.out.println("Invalid input! Adding additional elements to the board");
                userInput = scanner.nextLine().split(" ");
                continue;
            }

            if (board.get(indexOne).equals(board.get(indexTwo))){
                System.out.printf("Congrats! You have found matching elements - %s!\n",board.get(indexOne));

                if (indexOne>indexTwo){
                    board.remove(indexOne);
                    board.remove(indexTwo);
                } else{
                    board.remove(indexTwo);
                    board.remove(indexOne);
                }
                if (board.size()==0){
                    System.out.printf("You have won in %d turns!",movesCounter);
                    return;
                }
            }else{
                System.out.println("Try again!");
            }

            userInput = scanner.nextLine().split(" ");
        }
        System.out.println("Sorry you lose :(");
        System.out.println(board.toString().replaceAll("[\\[\\],]", ""));
    }
}
