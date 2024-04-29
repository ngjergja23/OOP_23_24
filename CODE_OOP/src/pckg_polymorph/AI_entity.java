package pckg_polymorph;

public class AI_entity {
    private String name;
    private String version;
    private int id;
    private static int cntID = 100;

    public AI_entity (String name){
        this.name = name;
        this.id = cntID++;
    }

    public AI_entity(String name, String version){
        this.name = name;
        this.version = version;
    }
    // ovo gore je isto primjer statickog polimorfizma (samo s konstruktorima a ne metodama)

    public void performOperation (int n1 , int n2) {
        System.out.println("Result of (+) is: " + (n1 + n2)); //bez zagrade tretira kao konkatenaciju stringa
        System.out.println("Result of (*) is: " + n1 * n2);

    }
    public void performOperation (int n1 , int n2 , int pot){
        System.out.println(Math.pow(n1,pot));
        System.out.println(Math.pow(n2,pot));
    }

    @Override
    public String toString() {
        return "AI_entity{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", id=" + id +
                '}';
    }
}
