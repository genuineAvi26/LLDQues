import java.time.LocalDateTime;

public class Ticket{
    private String TicketId;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Vehicle vehicle;
    private ParkingSpot parkingspot;
    private PricecalculationStrategy strategy;

    Ticket(string TicketId,Vehicle vehicle,ParkingSpot parkingspot,PricecalculationStrategy strategy){
        this.TicketId=TicketId;
        this.vehicle=vehicle;
        this.parkingspot=parkingspot;
        this.strategy=strategy;
    }
    //getter and setter methods
    String getTicketId(){
        return TicketId;
    }
    String getEntryTime(){
        return entryTime;
    }
    String getExitTime(){
        return exitTime;
    }
    Vehicle getvehicle(){
        return vehicle;
    }
    ParkingSpot getSpot(){
        return parkingspot;
    }
    void setTicketId(String TicketId){
        this.TicketId=TicketId;
    }
    void setEntryTime(String entryTime){
        this.entryTime=entryTime;
    }
    void setExitTime(String exitTime){
        this.exitTime=exitTime;
    }
    void setvehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void closeTicket(){
        this.exitTime=LocalDateTime.now();
    }
    public double calculatePrice(){
        long hour=java.time.Duration.between(exitTime, entryTime).toHours();
        if(hour==0) hour=1;
        return strategy.pay(hour);
    }
}