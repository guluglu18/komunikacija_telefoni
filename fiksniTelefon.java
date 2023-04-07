package komunikacija;

public class fiksniTelefon extends Telefoon implements KomunikacijaTelefoni{
    private double duzinaKabla;

    public fiksniTelefon(String proizvodjac, String model, String broj, double duzinaKabla) {
        super(proizvodjac, model, broj);
        this.duzinaKabla = duzinaKabla;
    }

    @Override
    public String toString() {
        return "F{" +
                super.toString() +
                ", duzina kabla=" + duzinaKabla +
                '}';
    }

    @Override
    public void pozovi(String broj) {
        System.out.println("Pozvali  ste broj: " + broj);
    }

    @Override
    public void javiSe() {
        System.out.println("Javili ste se!");
    }
}
