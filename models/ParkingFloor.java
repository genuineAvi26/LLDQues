public class ParkingFloor {
    int floorNo;
    List<ParkingSpot> ParkingSpots=new ArrayList<>();
    
    public ParkingFloor(int floorNo){
        this.floorNo=floorNo;
    }
    public void addSpot(ParkingSpot spot){
        ParkingSpots.add(spot);
    }
    public ParkingSpot getAvalSpot(Vehicle vehicle){
        for(auto spot:ParkingSpots){
            if(spot.isAvailable() && spot.getSpotType()==vehicle.getVehicleType()){
                return spot;
            }
        }
    }
}
