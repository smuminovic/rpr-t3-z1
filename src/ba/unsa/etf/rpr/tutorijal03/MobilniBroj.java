package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    //atributi
    int mobilnaMreza;
    String broj;

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
