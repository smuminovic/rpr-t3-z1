package ba.unsa.etf.rpr.tutorijal03;


public class MedjunarodniBroj extends TelefonskiBroj {
    //atributi
    private String drzava;
    private String broj;
    //konstruktor
    public MedjunarodniBroj (String drzava, String broj) {
        this.drzava = drzava;
        this.setBroj(broj);
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }
    public String getBroj() {
        return broj;
    }
    @Override
    public int hashCode() {
        return 0;
    }
    @Override
    public String ispisi() {
        return drzava+"/"+getBroj();
    }
    @Override
    public int compareTo(Object o){return 0;}

}
