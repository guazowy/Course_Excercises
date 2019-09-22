package pl.sda.poznan_25;

import java.util.Scanner;

public class Zadanie2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give a number:");
        int userinput = input.nextInt();
        for(int i=1; i<=userinput; i++){
            if(i%2!=0)
                System.out.println(i);
        }
    }
}
