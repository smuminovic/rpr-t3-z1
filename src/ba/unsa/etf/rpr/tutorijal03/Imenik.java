package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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
    public String dajBroj(String ime) {
        TelefonskiBroj br=null;
        if (contactMap.containsKey(ime)) {
            br = this.contactMap.get(ime);
        }
        return br.ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        String ime = "";
        return  this.contactMap.get(broj).toString();
    }

    String naSlovo(char s) {
        String ss = "" + s;
        String spisak = "";
        int redni_br = 0;
        for (String ime : contactMap.keySet()) {
            if (ime.startsWith(ss)) {
                redni_br+=1;
                spisak += (redni_br + ". " + ime + " - " + dajBroj(ime) + "\n");
            }
        }
        return spisak;
    }

    public Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> spisak = new HashSet<String>();
        for (String ime : this.contactMap.keySet()) {
            TelefonskiBroj broj1 = this.contactMap.get(ime);
            if (broj1 instanceof TelefonskiBroj) {
                FiksniBroj br2 = (FiksniBroj) broj1;
                if (br2.getGrad() == g) spisak.add(ime);
            }
        }
        return  spisak;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> skup = new HashSet<TelefonskiBroj>();
        for (String ime : this.contactMap.keySet()) {
            TelefonskiBroj br1 = this.contactMap.get(ime);
            if (br1 instanceof FiksniBroj) skup.add(br1);
        }
        TreeSet<TelefonskiBroj> ts = new TreeSet<TelefonskiBroj>();
        ts.addAll(skup);
        return ts;
    }
}
