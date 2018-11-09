package ba.unsa.etf.rpr.tutorijal03;


public class MedunarodniBroj extends TelefonskiBroj {
    //atributi
    private String drzava;
    private String broj;
    //konstruktor
    public MedunarodniBroj(String drzava1, String broj1) {
        this.drzava = drzava1;
        this.broj = broj1;
    }

    public void setBroj(String broj1) {
        this.broj = broj1;
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
