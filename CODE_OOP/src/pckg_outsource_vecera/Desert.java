package pckg_outsource_vecera;

public class Desert {
    private String naziv;
    private int kol;


    public Desert(String naziv, int kol){
        this.naziv = naziv;
        this.kol = kol;

    }

    @Override
    public String toString() {
        return "Desert{" +
                "naziv='" + naziv + '\'' +
                ", kol=" + kol +
                '}';
    }

    public void infoDesert(){
        System.out.println(this);
    }
























}
