package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {

    public static int sumaCifara(int i) {
        int suma=0;
        while(i!=0) {
            suma = suma + i % 10;
            i = i / 10;
        }
        return suma;
    }

    public static void main(String[] args) {

        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();

        for(int i=1; i<=n; i++) {
            if(i%sumaCifara(i) == 0 ) System.out.println(""+i);
        }


    }
}
