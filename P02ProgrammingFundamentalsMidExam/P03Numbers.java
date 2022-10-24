package P02ProgrammingFundamentalsMidExam;

import java.util.*;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double averageNum = 0;
        for (int i = 0; i < myList.size(); i++) {
            averageNum+=myList.get(i);
        }
        averageNum/= myList.size();
        List<Integer> topIntList = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i)>averageNum){
                topIntList.add(myList.get(i));
            }
        }

        Collections.sort(topIntList);
        Collections.reverse(topIntList);

        if (topIntList.size()==0){
            System.out.println("No");
        } else {
            for (int i = 0; i < topIntList.size(); i++) {
                System.out.print(topIntList.get(i) + " ");{
                    if (i==4){
                        return;
                    }
                }
            }
        }





    }
}
