package Zad_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCreator {
    
    private static List<String> cities;
    private static Scanner scanner = new Scanner(System.in);
    private static String pattern = "[A-Za-z ]*";
    
    public static void popList(){

        cities = new ArrayList<>(3);

        for (int i = 0; i < 3; i++) {

            while (true){
                System.out.println("Enter a city name: ");
                String cityName = scanner.nextLine();

                if (cityName.matches(pattern)){
                    cities.add(cityName);
                    break;
                }else {
                    System.out.println("Wrong");
                }

            }
        }
        System.out.println(cities);
        
    }
    
    
}
