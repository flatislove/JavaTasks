/**
 * Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small,
 * with a fixed number of slots for each size.
 * Implement the ParkingSystem class:
 * ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class. The number of slots
 * for each parking space are given as part of the constructor.
 * bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into
 * the parking lot. carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3
 * respectively. A car can only park in a parking space of its carType. If there is no space available, return false,
 * else park the car in that size space and return true.
 */
class DesignParkingSystem {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }
}

class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1 -> {
                if (big > 0) {
                    this.big--;
                    return true;
                } else {
                    return false;
                }
            }
            case 2 -> {
                if (medium > 0) {
                    this.medium--;
                    return true;
                } else {
                    return false;
                }
            }
            case 3 -> {
                if (small > 0) {
                    this.small--;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
