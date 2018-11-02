package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    //atributi
    private int mobilnaMreza;
    private String broj;
    //konstruktor
    public MobilniBroj(int mobilnaMreza, String broj) {
        this.setMobilnaMreza(mobilnaMreza);
        this.setBroj(broj);
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }
    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
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
