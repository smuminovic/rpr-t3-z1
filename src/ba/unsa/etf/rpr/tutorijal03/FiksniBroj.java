package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj implements Comparable{
    public String broj;
    public Grad grad;

    public FiksniBroj(Grad grad, String broj){
        this.setGrad(grad);
        this.setBroj(broj);
    }
    enum Grad {
        TRAVNIK(30), ODZAK(31), SARAJEVO(33), BREZA(32), LIVNO(34), TUZLA(35), KONJIC(36), BIHAC(37), GORAZDE(38), LJUBUSKI(39);
        private final int id;
        Grad(int id) { this.id = id; }
        public  int getValue() { return id; }
    }


    //getteri
    public String getBroj() {
        return broj;
    }
    public Grad getGrad() {
        return grad;
    }
    //setteri
    public void setGrad(Grad grad) {
        this.grad = grad;
    }
    public void setBroj(String broj) {
        this.broj = broj;
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
        return this.getBroj().compareTo(((FiksniBroj)o).getBroj());
    }
}
