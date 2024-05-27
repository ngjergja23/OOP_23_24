package pckg_serial_deserial;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;


public class Spaceship implements Serializable,EqualsSpaceShips{
    private String spaceshipName;
    private int id;
    private static int cntID = 100;
    private LocalDate firstMissionDate;
    private int numMissions;
    private static final int STARTYEAR = 2000;
    private static final int MINI = 1;
    private static final int MAXI = 1000;


    public Spaceship(String name){
        this.spaceshipName = name;
        this.id = cntID++;
        this.firstMissionDate = null;
        this.numMissions = ThreadLocalRandom.current().nextInt(MINI,MAXI);

    }
    private LocalDate generateRandomFirstMissionDate(){
        LocalDate startDate = LocalDate.of(STARTYEAR, 1, 1);
        LocalDate endDate = LocalDate.now();
        long start = startDate.toEpochDay();
        long end = endDate.toEpochDay();
        long random = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();


        return LocalDate.ofEpochDay(random);
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "spaceshipName='" + spaceshipName + '\'' +
                ", id=" + id +
                ", firstMissionDate=" + firstMissionDate +
                ", numMissions=" + numMissions +
                '}';

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Spaceship thisShip, Spaceship otherShip) {
        return thisShip.getId()==otherShip.getId();
    }
}

