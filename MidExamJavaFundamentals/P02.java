import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] allCars = scanner.nextLine().split(">>");
        double totalTaxes = 0.0;

        for (int i = 0; i < allCars.length; i++) {
            String[] singleCar = allCars[i].split(" ");
            String typeOfCar = singleCar[0];
            int years = Integer.parseInt(singleCar[1]);
            int kilometers = Integer.parseInt(singleCar[2]);

            double currentCarTax=0;

            switch (singleCar[0]){
                case "family":
                    int priceForKm = kilometers/3000;
                    currentCarTax = priceForKm*12 + (50-years*5);

                    break;
                case "heavyDuty":
                    priceForKm = kilometers/9000;
                    currentCarTax = priceForKm*14 + (80-years*8);
                    break;
                case "sports":
                    priceForKm = kilometers/2000;
                    currentCarTax = priceForKm*18 + (100-years*9);
                    break;
                default:
                    System.out.println("Invalid car type.");
                    continue;
            }
            System.out.printf("A %s car will pay %.2f euros in taxes.\n",typeOfCar,currentCarTax);
            totalTaxes+=currentCarTax;
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.",totalTaxes);
    }
}
