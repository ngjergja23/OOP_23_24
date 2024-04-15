package Extends;

public class TestSemafor {
    public static void main(String[] args) {
        Semafor semafor = new Semafor();
        System.out.println(semafor);
        semafor.getStatus();
// automatizirat?
        System.out.println(semafor);
        semafor.getStatus();
        semafor.putInWork();

        Semafor sem = new Semafor("1","0","0");
        Hacker hacker = new Hacker(sem);
        semafor.putInWork();
    }
}
