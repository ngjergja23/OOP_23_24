package pckg_serial_deserial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AUX_CLS_SER_DESER {
                    // parametrizirana verzija saveSpaceShipToFile()
    public static <T> void saveObjectToFile(String filePath, T someObject) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            oos.writeObject(someObject);
            System.out.println("Object written to a file");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <E> void saveMultipleObjectsToFile(String filePath, List<E> objects) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            for (E element : objects) {
                oos.writeObject(element);
                System.out.println("Object written to a file");
            }
            System.out.println("All objects are written to a file");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T readObjectFromFile(String filePath) {
        T someObj = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filePath)))) {

            someObj = (T) ois.readObject();
            System.out.println("Object recovered from a file");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return someObj;
    }


    public static <E> List<E> readObjectsFromFile(String path){
        List<E> elements = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(new File(path))){
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(fis.available() > 0){
                E someObject = (E) ois.readObject();
                elements.add(someObject);
                System.out.println("One object from file recovered");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {          //ako putanja i je dobra moze se javit io error zbog nemogucnosti citanja datoteke npr
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All data recovered");
        return elements;
    }
}
