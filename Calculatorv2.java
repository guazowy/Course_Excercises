package pl.sda.poznan_24;
import java.util.Scanner;

public class Calculatorv2 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Kalkulator");
        System.out.println("Podaj działanie w formacie: liczba1 działanie lizcba2");
        System.out.println("Pamiętaj o spacjach pomiędzy liczbami i znakiem operacji");
        System.out.println("Napisz exit żeby zamknąć program");

        //funkcja String.split(" ") - rozbije Stringa na tablicę Stringów oddzielonych spacjami
        //czyli 20 / 4 po tej funkcji da nam tablicę [20][/][4]

        while (true) {
            System.out.println("Podaj dzialanie: ");

            String dzialanie = userinput.nextLine();
            if (dzialanie.equals("exit")) {
                break;
            }

            String[] tablica = dzialanie.split(" ");

            double a = 0;
            double b = 0;
            String operacja;
            if (tablica.length != 3) {
                System.out.println("Piotr");
                continue;
            }

            try {
                a = Double.parseDouble(tablica[0]);
                operacja = tablica[1];
                b = Double.parseDouble(tablica[2]);
            } catch (NumberFormatException e) {
                System.out.println("Zly format");
                continue;
            }


//try {
//    a = Double.parseDouble(tablica[0]);   //parsujemy Stringi żeby zrobić z nich double, równie dobrze można by
            //   operacja = tablica[1];               //zrobić Integer.parseInteger, żeby zamienić Stringi na inty
            //   b = Double.parseDouble(tablica[2]);
// catch (NumberFormatException e) {
            //  System.out.println("Zły format");
            // continue;         //continue nam tutaj wywala błąd, bo na zajęciach wcześniej była jeszcze pętla while(true), żeby działało cały czas
//}

            switch (operacja) {
                case "+": {
                    System.out.println("Wynik to " + (a + b));
                }
                case "-": {
                    System.out.println("Wynik to " + (a - b));
                }
                case "x": {
                    System.out.println("Wynik to " + (a * b));
                }
                case "/": {
                    System.out.println("Wynik to " + (a / b));
                }
                default: {
                    System.out.println("Błędny znak operacji");

                }
            }


        }
    }}
