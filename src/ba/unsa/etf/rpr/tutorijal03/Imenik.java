package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private TelefonskiBroj broj;
    private String ime;
    private HashMap<String, TelefonskiBroj> contactMap;

    public Imenik() {
        this.contactMap = new HashMap<String, TelefonskiBroj>();
    }
    void dodaj(String ime1, TelefonskiBroj broj1) {
        this.contactMap.put(ime1, broj1);
    }
    public String dajBroj(String ime1) {
        TelefonskiBroj br=null;
        if (contactMap.containsKey(ime1)) {
            br = this.contactMap.get(ime1);
        }
        return br.ispisi();
    }

    public String dajIme(TelefonskiBroj broj1) {
        return this.contactMap.get(broj1).toString();
    }

    String naSlovo(char s) {
        String ss = "" + s;
        String spisak = "";
        int redniBr = 0;
        for (String ime : contactMap.keySet()) {
            if (ime.startsWith(ss)) {
                redniBr+=1;
                spisak += (redniBr + ". " + ime + " - " + dajBroj(ime) + "\n");
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
                if (br2.getGrad() == g) { spisak.add(ime); }
            }
        }
        return  spisak;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> skup = new HashSet<TelefonskiBroj>();
        for (String ime : this.contactMap.keySet()) {
            TelefonskiBroj br1 = this.contactMap.get(ime);
            if (br1 instanceof FiksniBroj) { skup.add(br1); }
        }
        TreeSet<TelefonskiBroj> ts = new TreeSet<TelefonskiBroj>();
        ts.addAll(skup);
        return ts;
    }
}
