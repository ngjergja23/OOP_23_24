package Zad_1;

import java.io.*;
import java.util.*;

public class AUX_CLS {


//    public static void readDataFromCSV(String fileName){
//
//        boolean userAsk;
//        File file = new File(fileName);
//
//        userAsk = true;
//        while (userAsk) {
//            try {
//                scanner = new Scanner(file);
//                while (scanner.hasNextLine()){
//                    //if file path valid do:
//                    String line = scanner.nextLine();
//
//                }
//                userAsk = false;
//
//            } catch (FileNotFoundException fnf) {
//                System.out.println(fnf.getMessage());
//                System.out.println("Try again? 'y' for YES, other for NO ");
//                Scanner scanner = new Scanner(System.in);
//                String inpt = scanner.next().toLowerCase();
//                if (inpt.equals("y")){
//
//                    System.out.println("Enter new file name/path: ");
//                    Scanner sc = new Scanner(System.in);
//                    String newFileName = sc.nextLine();
//                    file = new File(newFileName);
//
//                }else {
//                    System.out.println("No files read");
//                    userAsk = false;
//                }
//
//            }
//        }
//
//    }

    public static List<String[]> readDataFromCSV(String fileName){

        File file = new File(fileName);
        List<String[]> data = new ArrayList<>();
        String line;
        String [] separated;

        while (true) {
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    separated = line.split(",");
//                    System.out.println(Arrays.toString(separated));
                    data.add(separated);
                }
                break;

            } catch (FileNotFoundException fnf) {
                System.out.println(fnf.getMessage());
                System.out.println("Try again? 'y' for YES, other for NO ");
                Scanner scanner1 = new Scanner(System.in);
                String inpt = scanner1.nextLine().toLowerCase();
                if (inpt.equals("y")){
                    System.out.println("Enter a new file name/path");
                    Scanner scanner2 = new Scanner(System.in);
                    String newFileName = scanner2.nextLine();
                    file = new File(newFileName);
                }else {
                    System.out.println("No files read.");
                    break;
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        return data;

    }

    public static List<Student> createObjectsFromCSV(List<String[]> list){

        List<Student> students = new ArrayList<>();
        TreeMap<Integer, Student> studentTreeMap = new TreeMap<>();

        list.forEach(row -> {
            Student student;
            int ind = 0;
            int id = Integer.parseInt(row[ind]);
            ind++;
            String name = row[ind];
            ind++;
            String uni = row[ind];
            ind++;
            String []crs = row[ind].split(" ");
//            ArrayList <String> courses = new ArrayList<>();

//            for (String s : crs){
//                courses.add(s);
//            }

//            courses.addAll(Arrays.asList(crs));

            ArrayList<String> courses = new ArrayList<>(Arrays.asList(crs));

            student = new Student(id, name, uni, courses);
            studentTreeMap.put(id, student);


        });

        for (Integer k : studentTreeMap.keySet()){
            System.out.println(k + " : " + studentTreeMap.get(k));
        }

        return students;

    }

}
