package TextProcessingLab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String subStr = scanner.nextLine();
        String str = scanner.nextLine();
        //int startIndex = str.indexOf(subStr);
        while (str.contains(subStr)){

            str=str.replace(subStr,"");
          //  startIndex = str.indexOf(subStr);
        }
        System.out.println(str);
    }
}
