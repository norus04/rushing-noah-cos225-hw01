// Noah Rushing - Homework 1

public class ParkingTester{
    public static void main(String[] args){
        ParkingLot Lot = new ParkingLot();
        System.out.println("Parking Lot: " + Lot)
        
        Car Infiniti_A = new Car("Infiniti", "A", true);
        int Index_1 = Lot.parkCar(Infiniti_A);
        System.out.println("Parking Lot: " + Lot);

        Car Cadillac_B = new Car("Cadillac", "B", "false");
        int Index_2 = Lot.parkCar(Cadillac_B);
        System.out.println("Parking Lot: " + Lot);

        Car carRemoved = Lot.removeCar(Index_1);
        System.out.println(carRemoved + "removed from space " + Index_1);
        System.out.println("Parking Lot: " + Lot);
    }
}
