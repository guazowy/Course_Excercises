import java.util.Scanner;
public class Czesc {
    public static void main (String[] args){
 Scanner scan = new Scanner(System.in);

 welcome("Krzysiek");
 System.out.println("Teraz podaj swoje imie");
 welcome(scan.nextLine());

    }

    static void welcome(String name){
        System.out.println("Cześć " + name);
    }

}