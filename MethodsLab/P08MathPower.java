package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        DecimalFormat dF = new DecimalFormat("0.####");
        System.out.println(dF.format(power(n,p)));


        //System.out.println(power(n,p));
    }
    public static double power(double n, int p){
        double result = Math.pow(n,p);
        return result;
    }
}
