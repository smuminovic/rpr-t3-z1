package ba.unsa.etf.rpr.tutorijal03;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static Scanner ulaz = new Scanner(System.in);
    public static PrintStream izlaz= System.out;
    private static Imenik imenik=new Imenik();

    public static void dodajKontakta(PrintStream izlaz, Scanner ulaz){
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

    public static void dajKontakta(){
        izlaz.println("Unesite ime kontakta kojeg zelite: ");
        String ime=ulaz.nextLine();
        String broj=imenik.dajBroj(ime);
        izlaz.println(broj);
    }

    public static void kontakteNaSlovo(){
        izlaz.println("Unesite slovo: ");
        char slovo=ulaz.next().charAt(0);
        String naSlovo=imenik.naSlovo(slovo);
        izlaz.print(naSlovo);
    }

    public static void izGrada(){
        Set<String> skup= new TreeSet<String>();
        String imeGrada=ulaz.nextLine();
        FiksniBroj.Grad grad = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
        skup=imenik.izGrada(grad);
        String result = "";
        for (String ime: skup) {
            result += ime + ",";
        }
    }

    public static void izGradaLjudi(){
        Set<TelefonskiBroj>skup= new TreeSet<TelefonskiBroj>();
        String imeGrada=ulaz.nextLine();
        FiksniBroj.Grad grad = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
        skup=imenik.izGradaBrojevi(grad);
        String result = "";
        for (TelefonskiBroj broj: skup) {
            result += broj.ispisi() + ",";
        }
    }

    public static void main(String[] args) {
        dodajKontakta(izlaz,ulaz);
        int i;
        vanjska: for (i = 0;;) {
            System.out.println("Odaberite jednu opciju:\n");
            System.out.println("0: Izlaz iz programa 1: Dodaj kontakte u mapu 2: Daj broj kontakta\n ");
            System.out.println("4: Sve kontakte na unseno slovo 5: Skup kontakata iz grada 6: Skup osoba iz grada");
            int n = ulaz.nextInt();
            switch(n) {
                case 0:
                    break vanjska;
                case 1:
                    dodajKontakta(izlaz, ulaz);
                    break;
                case 2:
                    dajKontakta();
                    break;
                case 4:
                    kontakteNaSlovo();
                    break;
                case 5:
                    izGrada();
                    break;
                case 6:
                    izGradaLjudi();
                    break;
            }
        }
    }
}
