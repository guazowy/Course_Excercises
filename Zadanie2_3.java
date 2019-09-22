package pl.sda.poznan_25;
import java.util.Scanner;

public class Zadanie2_3 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double liczba = input.nextDouble();

for(int i=0; Math.pow(2,i)<=liczba; i++){
    System.out.println(Math.pow(2,i));
}
    }
}
