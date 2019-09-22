package pl.sda.poznan_25;
import java.util.Random;

public class Zadanie3_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tablica = new int[10];
        for (int i = 0; i < 10; i++) {
            tablica[i] = rand.nextInt(21 - 10);
        }
        System.out.println("Zawartość tablicy to: ");
        int index = 0;
        while (index < tablica.length) {
            System.out.print(tablica[index]);
            System.out.print(" ");
            index++;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(index=0; index<tablica.length; index++){
            if(max<tablica[index]){
                max=tablica[index];
            } else if (min > tablica[index]){
                min = tablica[index];
            }
        }
        System.out.println();
        System.out.println("Najmniejsza wartość z tablicy to "+min);
        System.out.println("Największa wartość z tablicy to " +max);
        double mean;
        double sum=0;
        for(index=0; index<tablica.length; index++){
            sum += tablica[index];
        }mean=sum/tablica.length;
        System.out.println("Srednia wartości z tablicy to " +mean);
    }

}