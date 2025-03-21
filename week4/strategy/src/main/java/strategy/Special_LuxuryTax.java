
package strategy;


public class Special_LuxuryTax implements TaxStrategy{
    @Override
    public double calculateTax(double price) {
        return price * 0.25;
    }
}
