package MapsLambdaAndStreamAPILab;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsInput = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<String, Integer>();

        for (String word:wordsInput){
            word = word.toLowerCase();

            if (!wordsMap.containsKey(word)){
                wordsMap.put(word,0);
            }
            wordsMap.put(word,wordsMap.get(word)+1);
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry:wordsMap.entrySet()){
            if (entry.getValue()%2!=0){
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",resultList));
    }
}
