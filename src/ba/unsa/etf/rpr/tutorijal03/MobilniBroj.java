package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    //atributi
    private int mobilnaMreza;
    private String broj;
    //konstruktor
    public MobilniBroj(int mobilnaMreza1, String broj1) {
        this.mobilnaMreza = mobilnaMreza1;
        this.broj = broj1;
    }

    public void setBroj(String broj1) {
        this.broj = broj1;
    }
    public void setMobilnaMreza(int mobilnaMreza1) {
        this.mobilnaMreza = mobilnaMreza1;
    }

    public int getMobilnaMreza() {
        return mobilnaMreza;
    }
    public String getBroj() {
        return broj;
    }


    @Override
    public int hashCode() {
        return  0;
    }
    @Override
    public String ispisi() {
        return "0"+getMobilnaMreza()+"/"+getBroj();
    }
}
