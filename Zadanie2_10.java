package pl.sda.poznan_25;

import java.util.Scanner;

public class Zadanie2_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę aby poznać jej dzielniki");
        int userinput = scan.nextInt();
        int dzielnik;
        for (dzielnik = 1; dzielnik <= userinput; dzielnik++) {
            if (userinput % dzielnik == 0) {
                System.out.println(dzielnik);
            }
        }
    }
}
