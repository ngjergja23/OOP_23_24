package Extends;

public class Hacker {
    private Semafor s;

    public Hacker() {

    }
    public Hacker(Semafor sem) {
        this.s = sem;
    }

    public Semafor getS() {
        return s;
    }

    public void setS(Semafor s) {
        this.s = s;
    }

    public void ChangeCode(String codeNew){
        char[] chars = codeNew.toCharArray();
        s.setZeleno(String.valueOf(chars[0]));
        s.setCrveno(String.valueOf(chars[1]));
        s.setZuto(String.valueOf(chars[2]));

    }















}
