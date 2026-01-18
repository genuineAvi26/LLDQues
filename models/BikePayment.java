
public class BikePayment implements PricecalculationStrategy{
    @Override
    public double pay(long hour){
      return hour*10;
    }
}
