package PF01ProgrammingFundamentalsFinalExamRetake;

import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> songMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];
            songMap.putIfAbsent(piece, new ArrayList<>());
            songMap.get(piece).add(composer);
            songMap.get(piece).add(key);
        }
        String[] command = scanner.nextLine().split("\\|");
        while (!command[0].equals("Stop")) {
            switch (command[0]) {
                case "Add":
                    String piece = command[1];
                    String composer = command[2];
                    String key = command[3];
                    if (songMap.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!\n", piece);
                    } else {
                        songMap.put(piece, new ArrayList<>());
                        songMap.get(piece).add(composer);
                        songMap.get(piece).add(key);
                        System.out.printf("%s by %s in %s added to the collection!\n"
                                , piece, songMap.get(piece).get(0), songMap.get(piece).get(1));
                    }
                    break;
                case "Remove":
                    piece = command[1];
                    if (songMap.containsKey(piece)) {
                        songMap.remove(piece);
                        System.out.printf("Successfully removed %s!\n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }
                    break;
                case "ChangeKey":
                    piece = command[1];
                    String newKey = command[2];

                    if (songMap.containsKey(piece)){
                        songMap.get(piece).set(1,newKey);
                        System.out.printf("Changed the key of %s to %s!\n",piece,newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }
                    break;
            }
            command = scanner.nextLine().split("\\|");
        }
        for (Map.Entry<String, List<String>> entry : songMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s\n"
                    , entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }

    }
}
