import java.math.BigDecimal;
public class Main {
    public static void main (String[] args){

         double liczba1 = 5;
         double liczba2 = 7;
         double wynik=dodawanie(liczba1,liczba2); //* TO JEST ZMIENNA wynik TYPU double KTÓREJ WARTOSC ZWRACA FUNKCJA NA DOLE *//
         BigDecimal a = new BigDecimal(4.7767676767675757587585875785);
         BigDecimal b = new BigDecimal(6.9898565462193667853263242242);

        System.out.println(wynik);   //* tu system wydrukuje wartość zmiennej wynik którą określiliśmy na górze *//
        System.out.println(dodawanie(liczba1,liczba2)); //* tu system wydrukuje wartość funkcji dodawanie, która jest
                                                        // określona na dole *//
        System.out.println(dodawanie(a,b));//* tu system wydrukuje wartość funkcji dodawanie, która jest
                                        // określona na dole, ale tylko tej która przyjmuje BigDecimale *//

        //* Czyli tak naprawdę to nam po prostu skraca kod, możemy za każdym razem odnosić się do funkcji i podawąć jej
        // wszystkie wartości, ale przejrzyściej jest jak przypniemy wynik tej funkcji do jakiejś zmiennej, tak jak
        // zrobiliśmy to tutaj *//
    }
    static double dodawanie(double liczba1,double liczba2) {
        return liczba1+liczba2; //* TO JEST FUNKCJA a piszemy ją tutaj, czyli jeszcze w klasie main ale poza nawiasem kończącym
                                // tą główną funkcję main, która zawsze musi być *//
                                //* bo nie można pisać funkcji w funkcji *//
    }

    public static BigDecimal dodawanie(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

}
