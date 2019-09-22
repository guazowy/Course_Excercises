public class liczby {
    public static void main(String[] args) {

        int x = 9;
        System.out.println("Wartość x to " + x);
        calculating(x);
        System.out.println(calculating(x));
        System.out.println("Wartość x po zmianie to "+ calculating(x));

    }
    static int calculating(int x){
        return x*x;
    }
}
