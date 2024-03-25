package pckg_arrays;

import java.util.Arrays;

public class TestArr {
    public static void main(String[] args) {

        int[] arr = AUX_CLS.populateArrayRand(5);
        System.out.println(Arrays.toString(arr));
        AUX_CLS.listItems(arr);

        //
//
//        int[] arrNew = AUX_CLS.populateArrayMan(3);
//        AUX_CLS.listItems(arrNew);

        //


        String[] strArr = {"Vasa", "vana plurium", "sonant"};

//        String linked = AUX_CLS.linkUsingJoin(strArr);
//        System.out.println(linked);
//        String sblinked = AUX_CLS.linkUsingBuilder(strArr);
//        System.out.println(sblinked);


        int[][]arr2d = AUX_CLS.gen2DArr(3,4);
        System.out.println(Arrays.deepToString(arr2d));
        System.out.println("++++++++++++++++++++++++++");
        AUX_CLS.list2DArray(arr2d);



    }
}
