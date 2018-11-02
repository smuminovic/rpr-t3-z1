package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik {
    TelefonskiBroj broj;
    String ime;
    HashMap<String, TelefonskiBroj> contactMap;

    public Imenik() {
        this.contactMap = new HashMap<String, TelefonskiBroj>();
    }
    void dodaj(String ime, TelefonskiBroj broj) {

    }
    String dajBroj(String ime) {
        TelefonskiBroj br=null;
        if (contactMap.containsKey(ime)) {
            br = this.contactMap.get(ime);
        }
        return br.ispisi();
    }

    String dajIme(TelefonskiBroj broj) {
        String ime = "";
        return  this.contactMap.get(broj).toString();
    }
}
