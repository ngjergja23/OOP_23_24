package pckg_collections_2;

import java.util.Comparator;

public class LengthStringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()){
            return 1;                                   //za obrnuti redoslijed zamijenimo 1 i -1
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;          //ako su isti
        }
    }
}
