import java.util.Scanner;
public class Petla_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int secondToExplode = scanner.nextInt();
        System.out.println("Bomba wybuchnie za ");
        do {System.out.println(secondToExplode);
                    secondToExplode--;
            }while (secondToExplode > 0);
        System.out.println("BOOOM!");
        }
    }