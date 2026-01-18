public class TruckPayment implements PricecalculationStrategy{
    public double pay(double hour){
        return hour*30;
    }
}
