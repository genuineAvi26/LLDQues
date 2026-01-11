import models.*;

public class ParkingSpot {
    String spotId;
    ParkingFloor floor;
    Status status;
    ParkingSpot(String spotId,ParkingFloor floor,Status status){
        this.floor= floor;
        this.spotId= spotId;
        this.status= status;
    }
    String getSpotId(){
        return this.spotId;
    }
    ParkingFloor getFloor(){
        return this.floor;
    }
    Status getStatus(){
        return this.status;
    }
    void setStatus(Status status){
        this.status= status;
    }
    void setFloor(ParkingFloor floor){
        this.floor= floor;
    }
    void setSpotId(String spotId){
        this.spotId= spotId;
    }
}
