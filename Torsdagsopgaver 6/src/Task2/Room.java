package Task2;

public class Room {
    int walls;
    int numberOfDoors;
    int numberOfLamps;
    int numberOfWindows;

    public Room (int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.numberOfDoors=numberOfDoors;
        this.numberOfLamps=numberOfLamps;
        this.numberOfWindows=numberOfWindows;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumbersOfLamps() {
        return numberOfLamps;
    }

    public int getNumbersOfWindows() {
        return numberOfWindows;
    }

    public int getWalls () {
        return walls;
    }
}

