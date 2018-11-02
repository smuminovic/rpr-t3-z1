package ba.unsa.etf.rpr.tutorijal03;

public class MedjunarodniBroj extends TelefonskiBroj {
    //atributi
    private String drzava;
    private String broj;
    public MedjunarodniBroj (String drzava, String broj) {
        this.drzava = drzava;
        this.setBroj(broj);
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }
}
