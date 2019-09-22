import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[]{1,3,5,10};
        System.out.println(numbers[2]);

        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }

        }
        for (int i=numbers.length-1; i>=0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
