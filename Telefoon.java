package komunikacija;

public abstract class Telefoon {
    protected String proizvodjac;
    protected String model;
    protected String broj;
    protected static int brTelefona = 0;

    public Telefoon(String proizvodjac, String model, String broj){
        this.proizvodjac = proizvodjac;
        this.model = model;
        this.broj = broj;
        brTelefona++;
    }
    public static int getBrTelefona(){
        return brTelefona;
    }

    @Override
    public String toString() {
        return "Proizvodjac: " + this.proizvodjac +
                ", Model: " + this.model +
                ", Broj: " + this.broj;
    }
}
