package komunikacija;

import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KomunikacijaTelefoni> telefoni = new ArrayList<>();
        int izbor;
        do {
            System.out.println("1. Unos mobilnog telefona");
            System.out.println("2. Unos fiksnog telefona");
            System.out.println("3. Kraj unosa");
            System.out.print("Izbor: ");
            izbor = sc.nextInt();
            sc.nextLine();
            if (izbor == 1) {
                System.out.print("Unesite proizvodjaca: ");
                String proizvodjac = sc.nextLine();
                System.out.print("Unesite model: ");
                String model = sc.nextLine();
                System.out.print("Unesite broj: ");
                String broj = sc.nextLine();
                System.out.print("Unesite mrezu: ");
                String mreza = sc.nextLine();
                System.out.print("Unesite precnik ekrana: ");
                double precnikEkrana = sc.nextDouble();
                sc.nextLine();
                MobilniTelefon mt = new MobilniTelefon(proizvodjac, model, broj, mreza, precnikEkrana);
                telefoni.add(mt);
            } else if (izbor == 2) {
                System.out.print("Unesite proizvodjaca: ");
                String proizvodjac = sc.nextLine();
                System.out.print("Unesite model: ");
                String model = sc.nextLine();
                System.out.print("Unesite broj: ");
                String broj = sc.nextLine();
                System.out.print("Unesite duzinu kabla: ");
                double duzinaKabla = sc.nextDouble();
                sc.nextLine();
                fiksniTelefon ft = new fiksniTelefon(proizvodjac, model, broj, duzinaKabla);
                telefoni.add(ft);
            }
        } while (izbor != 3);
        System.out.println("Pozivam sve telefone...");
        for (KomunikacijaTelefoni telefon : telefoni) {
            telefon.pozovi("064565201817");
        }
        System.out.println("Fiksni telefoni: ");
        for (KomunikacijaTelefoni telefon : telefoni) {
            if (telefon instanceof fiksniTelefon) {
                System.out.println(telefon);
            }
        }
        System.out.println("Mobilni telefoni: ");
        for (KomunikacijaTelefoni telefon : telefoni) {
            if (telefon instanceof MobilniTelefon) {
                System.out.println(telefon);
            }
        }
    }
}
