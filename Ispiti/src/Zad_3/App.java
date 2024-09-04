package Zad_3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        List<Helicopter> hels;
        hels = new ArrayList<>();
        List<Aeroplane> aers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0){
                hels.add(new Helicopter("Bravo" + i, i ,genRndFloat(10, 10000)));
            }else {
                aers.add(new Aeroplane("Falcon" + i, i,genRndFloat(10, 10000)));
            }

        }

        for (Helicopter h : hels){
            System.out.println(h.toString());
        }
        for (Aeroplane a : aers){
            System.out.println(a.toString());
        }

        BIN_CLS.saveDataToBIN("hel.bin",hels);
        BIN_CLS.saveDataToBIN("aer.bin",aers);

    }

    public static float genRndFloat(int min, int max) {

        Random random = new Random();
        float res = random.nextFloat() * (max - min) + min;
        return res;
    }

}
