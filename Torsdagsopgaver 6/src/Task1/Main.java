package Task1;

import Task1.Car;
import Task1.Driver;
import Task2.Building;
import Task2.Room;
import Task3.Customer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Task1

        Driver driverOne = new Driver("Natasja", 22);
        Car carOne = new Car("Hello", "new model", 2022, "Car");
        carOne.setDriver(driverOne);
        System.out.println(carOne.getDriver());
        System.out.println(carOne.toString());


        Car carTwo = new Car ("Hello", "Old model", 1999, "Truck");
        carTwo.setDriver(driverOne);
        System.out.println(carTwo.getDriver());
        System.out.println(carTwo.toString());

        //Task2

        Room room1 = new Room(1, 3, 3);
        Room room2 = new Room(2, 3, 5);
        Room room3 = new Room(6, 5, 1);

        ArrayList<Room> roomsList = new ArrayList<>();
        roomsList.add(room1);
        roomsList.add(room2);
        roomsList.add(room3);

        Building building1 = new Building(roomsList,2,4,true);

        System.out.println(building1.totalLamps());
        building1.oddOrNot();


        //Task 3

        ArrayList<String> customers = new ArrayList<>();
        customers.add("Natasja");
        customers.add("Hej");
        customers.add("Goddag");
        customers.add("farvel");
        customers.add("godmorgen");
        customers.add("godeftermiddag");

        printCustomer(customers);

    }

    public static void printCustomer(ArrayList <String>customers) {
        for (String s : customers) {
            System.out.println(s);
        }
    }
}
