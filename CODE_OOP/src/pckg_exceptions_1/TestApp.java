package pckg_exceptions_1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>();
        robots.add(new FlyingRobot("Fly-man01"));
        robots.add(new IndustrialRobot("Ind-man01"));
        robots.add(new FlyingRobot("Fly-man02"));
        // robots.add(new StarWarsRobot("R2-05"));
        System.out.println(robots);
    }
}
