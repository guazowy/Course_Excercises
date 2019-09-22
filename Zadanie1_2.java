package pl.sda.poznan_24;

import java.util.Scanner;
public class Zadanie1_2 {
    public static void main(String[] args) {
        Scanner takenumber = new Scanner(System.in);
        System.out.println("Please provide three numbers:");
        int num1 = takenumber.nextInt();
        int num2 = takenumber.nextInt();
        int num3 = takenumber.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Największa liczba to " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Największa liczba to " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Największa liczba to " + num3);
        }
        if (num1 < num2 && num1 < num3) {
            System.out.println("Najmniejsza liczba to " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Najmniejsza liczba to " + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("Najmniejsza liczba to " + num3);
        }
    }
}
