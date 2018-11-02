package ba.unsa.etf.rpr.tutorijal03;

//FiksniBroj sadrži konstruktor FiksniBroj(Grad grad, String broj). Parametar
//broj je dio telefonskog broja bez pozivnog broja npr. "123-456", a grad je
//promjenljiva pobrojanog tipa koji označava pozivni broj koji treba koristiti npr.:
//enum Grad { SARAJEVO, TUZLA, ZENICA…}
//Spisak pozivnih brojeva se može naći ovdje. Umjesto imena kantona koristite ime
//glavnog grada kantona (kao u primjeru iznad), a umjesto Brčko distrikta stavite
//BRCKO. Metoda ispisi() treba vratiti broj oblika "033/123-456"

public class FiksniBroj extends TelefonskiBroj implements Comparable{
    String broj;
    enum Grad {
        TRAVNIK(30), ODZAK(31), SARAJEVO(33), BREZA(32), LIVNO(34), TUZLA(35), KONJIC(36), BIHAC(37), GORAZDE(38), LJUBUSKI(39);
        private final int id;
        Grad(int id) { this.id = id; }
        public  int getValue() { return id; }
    }
    Grad grad;

    //getteri
    public String getBroj() {
        return broj;
    }
    public Grad getGrad() {
        return grad;
    }
    //setteri
    public void setGrad() {
        this.grad = grad;
    }
    public void setBroj() {
        this.broj = broj;
    }

    public FiksniBroj(Grad grad, String broj) {

    }

    //override
    @Override
    public String ispisi() {
        int br = this.getGrad().getValue();
        return "0"+br+"/"+ this.getBroj();
    }

    @Override
    public int hashCode(){
        return getGrad().getValue();
    }
    @Override
    public int compareTo(Object o) {
        FiksniBroj broj=(FiksniBroj) o;
        return  0;
    }
}
