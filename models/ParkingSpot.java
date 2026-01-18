import models.*;
public abstract class ParkingSpot {
    private int spotId;
    private spotType spotType;
    private Status status;
    private Vehicle vehicle;

    ParkingSpot(int spotId,spotType spotType){
        this.spotId=spotId;
        this.spotType=spotType;
        this.status=status.AVAILABLE;
        // this.vehicle=vehicle;
    }
    boolean isAvailable(){
        return status==Status.AVAILABLE;
    }
    public void assignVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        this.status=OCCUPIED;
    }
    public void removeVehicle(){
        this.vehicle=null;
        this.status=AVAILABLE;
    }
    public int getSpotId(){
        return spotId;
    }
    public spotType getSpotType(){
        return spotType;
    }
}
