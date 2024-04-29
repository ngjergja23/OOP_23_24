package pckg_collections1;

import pckg_polymorph.AI_entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        AUX_CLS.addElement(ints,100);           //pass by reference, ne triba return
        AUX_CLS.addElement(ints,300);
        AUX_CLS.addElement(ints,200);

        HashMap<Integer,String> map = new HashMap<>();
        AUX_CLS.addValueInMap(map,"prvi",1);
        AUX_CLS.addValueInMap(map,"drugi",2);
        AUX_CLS.addValueInMap(map,"novi prvi",1); //azuriranje, prebrisat ce se stara vrijednost

        AUX_CLS.listAllFromMap(map);

//        TreeSet<Integer> set = new TreeSet<>();
//        AUX_CLS.addElementToTreeSet(set,2);
//        AUX_CLS.addElementToTreeSet(set,15);
//        AUX_CLS.addElementToTreeSet(set,-1);
//        AUX_CLS.addElementToTreeSet(set,0);

//        AUX_CLS.listFromTreeSet(set);

        TreeSet<AI_entity> set2 = new TreeSet<>();             //--------------->> on ne zna kako se sortira AI_entity
        AUX_CLS.addElementToTreeSet(set2, new AI_entity("RT_34"));
        AUX_CLS.addElementToTreeSet(set2, new AI_entity("GH  - 55"));
        AUX_CLS.addElementToTreeSet(set2, new AI_entity("EE-h7"));
        AUX_CLS.listFromTreeSet(set2);




    }

}
