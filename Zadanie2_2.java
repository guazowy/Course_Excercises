package pl.sda.poznan_25;

import java.util.Scanner;
import java.util.ArrayList;

public class Zadanie2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Podaj dwie liczby, przy czym pierwsza musi być mniejsza");
            System.out.println("Pierwsza liczba to:");
            int a = input.nextInt();
            System.out.println("Druga liczba to:");
            int b = input.nextInt();
            if (a > b) {
                System.out.println("Pierwsza liczba musi być mniejsza");}
else{
        ArrayList<Integer> values = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            values.add(i);
        }
        int arrayInitialIndex = 0;
        int finalsum = 0;
        int finalsumwhile = 0;
        int finalsumdowhile = 0;

        for (int i = values.get(arrayInitialIndex); i <= b; i++) {//to było niepotrzebne, ale przynajmniej nauczyłeś się
            finalsum = finalsum + i;
        }                             //że jest coś takiego jak array list :) ale można było
        System.out.println(finalsum);                    //zrobić to tak samo podstawiając i=a zamiast
        //zamiast i=values.get(arrayInitialIndex)

        int i = a;
        do  {finalsumdowhile = finalsumdowhile+i;
            i++;
        } while (i <= b);
        System.out.println(finalsumdowhile);

        while (a <= b) {
            finalsumwhile = finalsumwhile + a;
            a++;
        }
        System.out.println(finalsumwhile);

    }

}}

