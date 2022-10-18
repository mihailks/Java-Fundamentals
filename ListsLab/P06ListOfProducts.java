package ListsLab;

import java.util.*;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            products.add(input);
        }
        Collections.sort(products);
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "." + products.get(i));
        }
    }
}
