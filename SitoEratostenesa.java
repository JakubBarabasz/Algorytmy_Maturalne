import java.util.Scanner;

class SitoEratostenesa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j,zakres,do_kad;
        int tablica[] = new int[10000];
        System.out.println("Podaj zakres:");
        zakres = scanner.nextInt();
        do_kad = (int) Math.floor(Math.sqrt(zakres));
        for (i=1; i<=zakres; i++) tablica[i]=i;
        for (i=2; i<=do_kad; i++) {
            if (tablica[i] != 0) {
                j = i+i;
                while (j<=zakres) {
                    tablica[j] = 0;
                    j += i;
                }
            }
        }

        System.out.println("Liczby pierwsze z zakresu od 1 do " + zakres);
        for (i=2; i<=zakres; i++) if (tablica[i]!=0) System.out.print(i + ", \n");
    }
}