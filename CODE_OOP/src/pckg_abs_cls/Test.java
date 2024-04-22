package pckg_abs_cls;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivo", "Ivic", "unist","IT");
        st1.getSignature(); // konstruktor se 2 puta pozvao
        st1.getInfo();
        st1.getSignature();
    }
}
