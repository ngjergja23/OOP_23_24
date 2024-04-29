package pckg_polymorph;

public class Test {
    public static void main(String[] args) {
        AI_entity ai1 = new AI_entity("P3Q2)");
        AI_entity ai2 = new AI_entity("KL22","1.0");
        ai1.performOperation(2,3);
        ai2.performOperation(2,3,2);

        System.out.println(ai1);
        System.out.println(ai2);
    }



}
