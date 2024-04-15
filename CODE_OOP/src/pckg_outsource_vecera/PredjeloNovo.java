package pckg_outsource_vecera;

public class PredjeloNovo extends Predjelo{
    private String proizvodac;
    public PredjeloNovo(String naziv, String vrsta, int kolicina, String pro) {
        super(naziv, vrsta, kolicina);
        this.proizvodac = pro;
    }

    @Override
    public String toString() {
        return "PredjeloNovo{" +
                "proizvodac='" + proizvodac + '\'' +
                ", naziv='" + naziv + '\'' +
                ", vrsta='" + vrsta + '\'' +
                ", kolicina=" + kolicina +
                '}';
    }
}
