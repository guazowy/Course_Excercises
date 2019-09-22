package pl.sda.poznan_25;
import java.util.Scanner;

public class Zadanie2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(true){int userinput = scan.nextInt();
        if(userinput==0){break;} else{
                        sum = sum+userinput;}
                  }System.out.println(sum);

    }
}
