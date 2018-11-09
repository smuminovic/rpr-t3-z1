package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj implements Comparable{
    private String broj;
    private Grad grad;

    public FiksniBroj(Grad grad1, String broj1){
        this.grad = grad1;
        this.broj = broj1;
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
    public void setGrad(Grad grad1) {
        this.grad = grad1;
    }
    public void setBroj(String broj1) {
        this.broj = broj1;
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
    @Override
    public boolean equals(Object obj) {
        FiksniBroj broj=(FiksniBroj) obj;
        return  this.getBroj()==broj.getBroj()&&this.getGrad()==broj.getGrad();
    }
}
