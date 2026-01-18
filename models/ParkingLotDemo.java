public class ParkingLotDemo {
    public static  void main(String[] args) throws InterruptedException{
        ParkingLot parkinglot=ParkingLot.getInstance();
        ParkingFloor parkingfloor1=new ParkingFloor(1);
        parkingfloor1.addSpot(new BikeParkingSpot(1));
        parkingfloor1.addSpot(new CarParkingSpot(2));
        parkingfloor1.addSpot(new TruckParkingSpot(3));
        parkinglot1.addFloor(parkingfloor1);
        Vehicle vehicle1=new Car("White","UP32AB0001");
        Ticket ticket=parkinglot.parkVehicle(vehicle1);
        Thread.sleep(2000);
        double ParkingCharges=parkinglot.unparkVehicle(ticket);
        System.out.println("Parking amount Rs"+ParkingCharges);
    }
}