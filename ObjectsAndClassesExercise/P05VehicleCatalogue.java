package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05VehicleCatalogue {
    public static class Vehicle {
        private String typeOfVehicle;
        private String modelOfVehicle;
        private String colorOfVehicle;
        private int horsepowerOfVehicle;

        Vehicle(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
            if (typeOfVehicle.equals("car")){
                this.typeOfVehicle="Car";
            } else {
                this.typeOfVehicle="Truck";
            }
            //this.typeOfVehicle = typeOfVehicle;
            this.modelOfVehicle = modelOfVehicle;
            this.colorOfVehicle = colorOfVehicle;
            this.horsepowerOfVehicle = horsepowerOfVehicle;
        }

        public String getTypeOfVehicle() {
            return this.typeOfVehicle;
        }

        public String getModelOfVehicle() {
            return this.modelOfVehicle;
        }

        public String getColorOfVehicle() {
            return this.colorOfVehicle;
        }

        public int getHorsepowerOfVehicle() {
            return this.horsepowerOfVehicle;
        }

        public String toString() {
            return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d"
                    , this.typeOfVehicle, this.modelOfVehicle, this.colorOfVehicle, this.horsepowerOfVehicle);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehiclesList = new ArrayList<>();

        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("End")) {

            String typeOfVehicle = input[0];
            String modelOfVehicle = input[1];
            String colorOfVehicle = input[2];
            int horsepowerOfVehicle = Integer.parseInt(input[3]);
            Vehicle vehicle = new Vehicle(typeOfVehicle, modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);
            vehiclesList.add(vehicle);

            input = scanner.nextLine().split(" ");
        }

        input = scanner.nextLine().split(" ");
        while (!input[0].equals("Close")) {

            for (Vehicle vehicle : vehiclesList) {
                if (vehicle.getModelOfVehicle().equals(input[0])) {
                    System.out.println(vehicle);
                }
            }

            input = scanner.nextLine().split(" ");
        }
        int carCounter = 0;
        int truckCounter = 0;
        double averageCarHP = 0;
        double averageTruckHP = 0;
        for (Vehicle vehicle : vehiclesList) {
            if (vehicle.getTypeOfVehicle().equals("Car")) {
                averageCarHP += vehicle.getHorsepowerOfVehicle();
                carCounter++;
            } else {
                averageTruckHP += vehicle.getHorsepowerOfVehicle();
                truckCounter++;
            }
        }
        if (carCounter != 0) {
            System.out.printf("Cars have average horsepower of: %.2f.\n", averageCarHP / carCounter);
        } else {
            System.out.println("Cars have average horsepower of: 0.00.");
        }
        if (truckCounter != 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHP / truckCounter);
        } else {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }
    }
}
