//package ArraysExercise;
//
//import java.util.Scanner;
//
//public class P09ArrayModifier {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        String line = scanner.nextLine();
//
//        int bestDnaPosition = 0;
//        int maxLength = 0;
//        int maxSumElements = 0;
//        String bestLocalDna = "";
//        int countDna = 0;
//        int bestCountDna = 0;
//        String[] bestDna = new String[n];
//        while (!line.equals("Clone them!")) {
//            countDna++;
//            String data = line.replaceAll("!", "");
//            String[] dna = data.split("0");
//            int currentLength = 0;
//            int currentSumElement = 0;
//            int currentPosition = 0;
//
//
//            for (int i = 0; i < dna.length; i++) {
//                currentSumElement += dna[i].length();
//                if (dna[i].length() > currentLength) {
//                    currentLength = dna[i].length();
//                    bestLocalDna = dna[i];
//
//                }
//            }
//            currentPosition = data.indexOf(bestLocalDna);
//
//            if (currentLength > maxLength) {
//                maxLength = currentLength;
//                maxSumElements = currentSumElement;
//                bestDnaPosition = currentPosition;
//                bestCountDna = countDna;
//                bestDna = data.split("");
//            } else if (currentLength == maxLength && (bestDnaPosition > currentPosition ||
//                    currentSumElement > maxSumElements)) {
//                maxLength = currentSumElement;
//                maxSumElements = currentSumElement;
//                bestDnaPosition = currentPosition;
//                bestCountDna = countDna;
//                bestDna = data.split("");
//            } else if (countDna == 1) {
//                maxLength = currentSumElement;
//                maxSumElements = currentSumElement;
//                bestDnaPosition = currentPosition;
//                bestCountDna = countDna;
//                bestDna = data.split("");
//            }
//            line = scanner.nextLine();
//        }
//        System.out.printf("Best DNA sample %d with sum: %d\n", bestCountDna, maxSumElements);
//        System.out.println(String.join(" ", bestDna));
//    }
//}
