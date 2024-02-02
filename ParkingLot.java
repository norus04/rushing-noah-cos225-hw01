// Noah Rushing - Homework 1

public class ParkingLot{
    public ParkingSpot[] spots;

    public ParkingLot(){
        this.spots = new ParkingSpot[10];
        for (int i = 0; i < 10; i++){   //for i in range(10)
            if (i <= 1){
                spots[i] = new ParkingSpot(true);
            }
            else{
                spots[i] = new ParkingSpot(false);
            }
        }
    }

public int parkCar(Car){
    for (int i = 0; i < spots.length; i++){
        if (spots[i].parkCar){
            return i;
        }
    }
}

public Car removeCar(int Index){
    if (Index >= 0 && Index < spots.length){
        return spots(Index).removeCar();
    }
}

    public String toString(){
        int handicapSpots = 0;
        int normalSpots = 0;
        for (ParkingSpot 
        }
        return "";
    }
}

