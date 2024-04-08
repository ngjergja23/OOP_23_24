package pckg_outsource_vecera;

public class Predjelo {
     String naziv;
     String vrsta;
     int kolicina;


    public Predjelo(String naziv, String vrsta, int kolicina){
        this.naziv = naziv;
        this.vrsta = vrsta;
        this.kolicina = kolicina;

    }

    public void pojediPredjelo(String naziv) {

        System.out.println("Pojedeno - " + getClass().getSimpleName() + " | " + naziv + " | " + kolicina);
    }
    int kojaKolicina(){
        return kolicina;
    }



}











