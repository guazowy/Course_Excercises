package pl.sda.poznan_25;
import java.util.Scanner;

public class Zadanie2_5 {
    public static void main(String[] args) {
        System.out.println("Podaj ciąg liczb całkowitych w formacie a,b,c,d,e,f");
   Scanner scan = new Scanner(System.in);
     //   String ciagliczbowy = scan.nextLine();

     //   String[]tablicacyfr = ciagliczbowy.split(",");
     //   int smallest = Integer.parseInt(tablicacyfr[0]);
     //   int largest  = Integer.parseInt(tablicacyfr[0]);
     //  for (int n = 1; n < tablicacyfr.length; ++n) {
     //       int value = Integer.parseInt(tablicacyfr[n]);
     //       if (value < smallest) {
      //          smallest = value;
      //      } else if (value > largest) {
      //          largest = value;
    //        }
     //   }
      //  System.out.println("The sum of smallest and largest value is " + smallest + " + " + largest + " = " + (smallest + largest));
      //  System.out.println("Arithmetic mean of the two is " + (smallest+largest)/2);
        int userinput = scan.nextInt();
        int najmniejsza = Integer.MAX_VALUE;
        int najwieksza = Integer.MIN_VALUE;
while(userinput!=0) {
    if (userinput < najmniejsza) {
        najmniejsza = userinput;
    } else if (userinput > najwieksza) {
        najwieksza = userinput;}
    userinput = scan.nextInt();

    }    System.out.println("Największa wartość to: " + najwieksza);
        System.out.println("Najmniejsza wartość to: " + najmniejsza);



    }
    }

