package pl.sda.poznan_25;
import java.util.Random;
import java.util.Scanner;

public class Zadanie2_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int number2Guess = rand.nextInt(101);   ///ale można podać parametr bound 100+1, i wtedy pozbyć się tej linijki
        if(number2Guess==0){number2Guess=1;}            //kodu nr 10, bo efekt będzie ten sam
        System.out.println("Zgadnij liczbę z zakresu 1-100");
        int userGuess = scan.nextInt();
        while (userGuess!=number2Guess){
            if(userGuess>number2Guess){
                System.out.println("Za dużo");}
            else if (userGuess<number2Guess) {
                    System.out.println("Za mało");
                }userGuess = scan.nextInt();
            }
        System.out.println("Wygrałeś, chodziło mi o liczbę "+number2Guess);
        }
    }

