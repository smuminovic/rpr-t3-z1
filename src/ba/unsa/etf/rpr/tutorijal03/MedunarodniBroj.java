package ba.unsa.etf.rpr.tutorijal03;


public class MedunarodniBroj extends TelefonskiBroj {
    //atributi
    private String drzava;
    private String broj;
    //konstruktor
    public MedunarodniBroj(String drzava, String broj) {
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


}
