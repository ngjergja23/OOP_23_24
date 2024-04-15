package pckg_outsource_vecera;

public class Predjelo {
     protected String naziv;  // kad je bez modifikatora pristupa vidljivo je samo klasama iz tog paketa
    protected String vrsta;  // kad je public, onda svim klasama, protected: vidljivo klasama koje extendaju tu klasu
    protected int kolicina;


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











