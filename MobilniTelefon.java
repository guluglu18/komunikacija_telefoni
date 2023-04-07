package komunikacija;

public class MobilniTelefon extends Telefoon implements KomunikacijaTelefoni{
    private String mreza;
    private double precnikE;

    public MobilniTelefon(String proizvodjac, String model, String broj, String mreza, double precnikE) {
        super(proizvodjac, model, broj);
        this.mreza = mreza;
        this.precnikE = precnikE;
    }


    @Override
    public String toString() {
        return "M{" +
                super.toString() +
                ", Operater: " + mreza +
                ", precnikE=" + precnikE +
                '}';
    }


    @Override
    public void pozovi(String broj) {
        System.out.println("Pozvrali ste: " + broj);
    }

    @Override
    public void javiSe() {
        System.out.println("Javili ste se...");
    }

    public void posaljiSMS(){
        System.out.println("Poslali ste SMS...");
    }

    public void posaljiMMS(){
        System.out.println("Poslali ste MMS...");
    }
}
