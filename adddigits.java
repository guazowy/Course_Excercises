import java.util.Scanner;

public class adddigits {
    public static void main(String[] args) {
        System.out.println("Give a number to sum its digits");
        Scanner scan = new Scanner(System.in);
        String userinput = scan.nextLine();
        String[] digits = userinput.split("");

int tableindex = 0;
        int sum = 0;
        System.out.println(digits.length);
        System.out.println(digits[digits.length-1]);

      while (tableindex<digits.length){
            String number = digits[tableindex];
            int result = Integer.parseInt(number);
            sum = sum+result;
            tableindex++;

        }System.out.println(sum);


    }

    }
