package pl.sda.poznan_24;

import java.util.Scanner;

public class Zadanie1_3 {

    static double BMI(double userweight, double userheight) {
        return userweight / ((userheight/100) * (userheight/100));
    }

    public static void main(String[] args) {
            System.out.println("Check your fitness level!");
        System.out.println("Input your weight in kilograms");
            Scanner userinput = new Scanner(System.in);
            double userweight = userinput.nextDouble();
            System.out.println("Input your height in centimeters:");
            double userheight = userinput.nextDouble();
            double userBMI = BMI(userweight,userheight);

        if (userBMI > 18.5 & userBMI < 24.9) {
            System.out.println("Brawo, waga prawidłowa :)");
        } else if (userBMI < 18.5) {
            System.out.println("Niedowaga, żryj więcej.");
        } else if (userBMI > 24.9 & userBMI < 27.0) {
            System.out.println("Nadwaga, żryj mniej.");
        } else if (userBMI > 27.0 & userBMI < 30.0) {
            System.out.println("Otyłość, żryj zdecydowanie mniej.");
        } else if (userBMI > 30.0) {
            System.out.println("Chorobliwa otyłość, opanuje się.");
        }

    }
}
