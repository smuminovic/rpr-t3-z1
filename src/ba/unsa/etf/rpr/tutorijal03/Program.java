package ba.unsa.etf.rpr.tutorijal03;

import java.io.PrintStream;
import java.util.Scanner;

public class Program {
    public static Scanner ulaz = new Scanner(System.in);
    public static PrintStream izlaz= System.out;
    private static Imenik imenik=new Imenik();

    public  static void DodajKontakta(PrintStream izlaz, Scanner ulaz){
        izlaz.println("Unesite ime kontakta: " );
        String ime=ulaz.nextLine();
        izlaz.println("Pristisnite 1 za unos fiksnog broja, 2 za unos mobilnog ili 3 za medjunarodni broj");
        int odabir=ulaz.nextInt();
        ulaz.nextLine();
        FiksniBroj fikbr;
        MobilniBroj mobbr;
        MedjunarodniBroj medbr;
        if(odabir==1) {
            izlaz.println("Unesite grad i broj: ");
            String grad= ulaz.nextLine();
            String broj= ulaz.nextLine();
            FiksniBroj.Grad value = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
            fikbr=new FiksniBroj(value, broj);
            imenik.dodaj(ime,fikbr);
        }
        else if(odabir==2){
            izlaz.println("Unesite mobilnu mrezu i broj: ");
            int mob_mreza=ulaz.nextInt();
            ulaz.nextLine();
            String broj=ulaz.nextLine();
            mobbr=new MobilniBroj(mob_mreza, broj);
            imenik.dodaj(ime, mobbr);
        }
        else if(odabir==3){
            izlaz.println("Unesite drzavu i broj: ");
            String mreza=ulaz.nextLine();
            String broj=ulaz.nextLine();
            medbr=new MedjunarodniBroj(mreza, broj);
            imenik.dodaj(ime,medbr);
        }
        else izlaz.println("Pogresan unos!");
    }

    public static void main(String[] args) {
        int i;
        vanjska: for (i = 0;;) {
            System.out.println("Odaberite jednu opciju:\n");
            System.out.println("0: Izlaz iz programa 1: Dodaj kontakte u mapu 2: Daj broj kontakta 3: Daj ime kontakta\n ");
            System.out.println("4: Sve kontakte na unseno slovo 5: Skup kontakata iz grada 6: Skup osoba iz grada");
            int n = ulaz.nextInt();
            switch(n) {
                case 0:
                    break vanjska;
                case 1:
                    DodajKontakta(izlaz, ulaz);
                    break;
            }
        }
    }
}
