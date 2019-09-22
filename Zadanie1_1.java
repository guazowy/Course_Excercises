package pl.sda.poznan_24;
import java.util.Scanner;

public class Zadanie1_1 {
    public static void main(String[] args) {
            System.out.println("1. Konwersja C -> F");
            System.out.println("2. Konwersja F -> C");
            Scanner scan = new Scanner(System.in);
            int userinput = scan.nextInt();

            if (userinput == 1) {
                System.out.println("Please give Celsius value to be converted");
                double value1 = scan.nextDouble();
                System.out.println(value1 + " Celsius is " + convC2F(value1) + " Fahrenheit");
            } else if (userinput == 2) {
                System.out.println("Please give Fahrenheit value to be converted");
                double value1 = scan.nextDouble();
                System.out.println(value1 + " Fahrenheit is " + convF2C(value1) + " Celsius");
            }
}   static double convC2F(double temp){
        return (temp * 1.8) + 32;
    }

    static double convF2C(double temp){
        return (temp - 32) * 5 / 9;
    }
}
