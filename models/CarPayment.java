public class CarPayment implements PricecalculationStrategy{
    public double pay(long hour){
        return hour*20;
    }
}
