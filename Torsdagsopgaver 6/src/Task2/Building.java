package Task2;

import java.util.ArrayList;

public class Building {
    ArrayList<Room> rooms;
    int numberOfBathrooms;
    int numberOfFloors;
    boolean isOfficeBuilding;


    public Building (ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public int getRooms() {
        return 0;
    }

    public int getNumberOfBathrooms () {
        return 0;
    }

    public int getNumberOfFloors () {
        return this.numberOfFloors;
    }

    public boolean getIsOfficeBuilding () {
        boolean b = true;
        return b;
    }

    public int totalLamps() {
        int total = 0;
        for (Room room : this.rooms) {
            total+=room.getNumbersOfLamps();
        }
        return total;
    }

    public void oddOrNot () {
       int floor = this.numberOfFloors;
       int room = this.rooms.size();
       if(floor>room) {
           System.out.println("this is an odd room");
       }
    }
}
