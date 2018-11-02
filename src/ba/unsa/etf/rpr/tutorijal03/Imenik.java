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
        this.contactMap.put(ime, broj);
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

    String naSlovo(char s) {
        String ss = "" + s;
        String spisak = "";
        int redni_br = 0;
        for (String ime : contactMap.keySet()) {
            if (ime.startsWith(ss)) {
                redni_br++;
                spisak += (redni_br + ". " + ime + " - " + dajBroj(ime) + "\n");
            }
        }
        return spisak;
    }
}
