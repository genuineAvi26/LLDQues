package models;

public abstract class Vehicle {
   private String color;
   private String RegNo;
   private VehicleType Vehicletype;

   Vehicle(String color,String RegNo,VehicleType Vehicletype){
        this.color=color;
        this.RegNo=RegNo;
        this.Vehicletype=Vehicletype;
   }
   String getVehicleColor(){
    return color;
   }
   String getRegNo(){
    return RegNo;
   }
   VehicleType getVehicleType(){
    return Vehicletype;
   }
   void setVehicleColor(String color){
    this.color=color;
   }
   void setRegNo(String RegNo){
    this.RegNo=RegNo;
   }
   void setVehicleType(VehicleType Vehicletype){
     this.Vehicletype=Vehicletype;
   }
}
