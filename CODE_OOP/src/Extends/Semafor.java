package Extends;

public class Semafor {
    private String crveno;
    private String zuto;
    private String zeleno;
    String code ;
    private static final String[] CODES = {"001", "010", "100"};

    public Semafor() {
        this.crveno = "0";
        this.zuto = "0";
        this.zeleno = "1";
        this.code = this.crveno + this.zuto + this.zeleno;
    }

    public Semafor(String cr, String zu, String ze) {
        this.crveno = cr;
        this.zuto = zu;
        this.zeleno = ze;
        this.code = this.crveno + this.zuto + this.zeleno;
    }

    public String getCrveno() {
        return crveno;
    }
    public void setCrveno(String crveno) {
        this.crveno = crveno;
    }
    public String getZuto() {
        return zuto;
    }
    public void setZuto(String zuto) {
        this.zuto = zuto;
    }
    public String getZeleno() {
        return zeleno;
    }
    public void setZeleno(String zeleno) {
        this.zeleno = zeleno;
    }

    @Override
    public String toString() {
        return "Semafor{" +
                "crveno='" + crveno + '\'' +
                ", zuto='" + zuto + '\'' +
                ", zeleno='" + zeleno + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    private boolean checkCode(){
        for (String el : CODES) {
            if (code.equals(el)) {
                return true;
            }
        }
        return false;
    }

    public void getStatus(){


        if (checkCode()){
            // dodati while -->> dodati scanner

            switch (code) {             //taj "code" mora biti immutable, odn. switch prima imm. data types
                case "001":
                    System.out.println("PROLAZ!"); break;
                case "010":
                    System.out.println("OPREZ!"); break;
                case "100":
                    System.out.println("STOP!"); break;
                default:
                    System.out.println("Greska koja nece biti..");

            }
        } else {
            System.out.println("Pogresan kod!");
        }
    }


    public void putInWork(){
        int cnt = 0;
        while (cnt<10){
            getStatus();
            int ind = (cnt+1)%3;
            this.code = CODES[ind];
            cnt++;

            // doskociti problemu postavljanja semafora opcenito od trenutnog koda
            // veza ind i cnt malo drukcija
        }
    }
}















