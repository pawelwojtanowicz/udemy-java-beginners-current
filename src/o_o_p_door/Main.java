package o_o_p_door;

public class Main {
    public static void main(String[] args) {

        CarDoor driverDoor = new CarDoor();
        driverDoor.name = "Driver";
        driverDoor.open();
        driverDoor.printStatus();


        CarDoor passengerDoor = new CarDoor();
        passengerDoor.name = "Passenger";
        driverDoor.name = "Passenger";
        passengerDoor.printStatus();
        passengerDoor.open();
        passengerDoor.printStatus();

    }


}