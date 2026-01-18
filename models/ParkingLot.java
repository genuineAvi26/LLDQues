import javax.management.RuntimeErrorException;

public class ParkingLot {
    private static ParkingLot instance;
    public List<ParkingFloor> parkingFloor=new ArrayList<>();
    int ticketCount=1;
    private ParkingLot(){}
    public static ParkingLot getInstance(){
        if(instance==NULL){
            instance=new ParkingLot();
        }
        return instance;
    }
    public addFloor(ParkingFloor floor){
        parkingFloor.push(floor);
    }
    public Ticket parkVehicle(Vehicle vehicle){
        for(auto floor:parkingFloor){
            ParkingSpot spot=floor.getAvalSpot(vehicle);
            if(spot!=null){
              spot.assignVehicle(vehicle);
              PricecalculationStrategy strategy=getStrategy(vehicle);
              return Ticket(ticketCount++,vehicle,spot,strategy);
            }
        }
        throw new RuntimeErrorException("No Spots Available");
    }
    public double unparkVehicle(Ticket ticket){
        ticket.closeTicket();
        double price= ticket.calculatePrice();
        ticket.getSpot().unparkVehicle();
        return price;
    }
    private PricecalculationStrategy getStrategy(Vehicle vehicle){
        switch(vehicle.getVehicleType()){
            case BIKE: return new BikePayment();
            case CAR:return new CarPayment();
            case TRUCK:return new TruckPayment();
            default: throw new IllegalArgumentException("Invalid Vehicle Type");
        }
    }
}
