import static java.lang.Math.*;
public class Kalkulator {
    public static void main(String[] args) {
    int a = 6;
    int b = 3;
    int c = 0;
    int d = 4;
    int wotever = java.lang.Math.multiplyExact(d,b);
    int mnozenie = Math.multiplyExact(a, b);
    int odejmowanie = Math.subtractExact(a, b);
        System.out.println("a + b = "+(a+b));
        System.out.println("a * b = "+mnozenie);
        System.out.println("a - b = "+odejmowanie);
        System.out.println("a : b = "+(a/b));
        System.out.println("d * b = "+wotever);
        System.out.println("nigdy nie dzielimy przez "+c);
    }
}

