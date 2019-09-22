package pl.sda.poznan_24;
import java.util.Scanner;

public class Zadanie1_6 {
    public static void main(String[] args) {

     Scanner userinput = new Scanner(System.in);

     while(true) {
         System.out.println();
         System.out.print("Hi, I'm a calculator\nInput first number:");
         System.out.println();
         double num1 = userinput.nextInt();
         System.out.println("Input arithmetic symbol: + - x or /");
         char symbol = userinput.next().charAt(0);
         System.out.println("Input second number:");
         double num2 = userinput.nextInt();

         if (symbol == '+') {
             System.out.println(num1 + " + " + num2 + " = " + dodawanie(num1, num2));
         } else if (symbol == '-') {
             System.out.println(num1 + " - " + num2 + " = " + odejmowanie(num1, num2));
         } else if (symbol == 'x') {
             System.out.println(num1 + " x " + num2 + " = " + mnozenie(num1, num2));
         } else if (symbol == '/') {
             if(num2==0){
                 System.out.println("Nie można dzielić przez zero");
             }else
             System.out.println(num1 + " / " + num2 + " = " + dzielenie(num1, num2));
         }
         System.out.print("Jeśli chcesz wyjść z programu, naciśnij '0'");
                 System.out.println();
                 int endprogram = userinput.nextInt();
                 if (endprogram == 0) {
                 break;
         }
     }
        }
        static double dodawanie ( double num1, double num2){
             return num1 + num2;
         }
         static double odejmowanie ( double num1, double num2){
             return num1 - num2;
         }
         static double mnozenie ( double num1, double num2){
             return num1 * num2;
         }
         static double dzielenie ( double num1, double num2){
             return num1 / num2;
         }
     }
