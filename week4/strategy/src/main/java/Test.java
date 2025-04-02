import models.Product;
import strategy.ConsumptionTax;
import strategy.Special_LuxuryTax;
import strategy.VAT;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product(1000,"Iphone 16 Plus", 4000, new VAT());
        Product product2 = new Product(1001,"Mì tôm", 650, new ConsumptionTax());
        Product product3 = new Product(1002, "Xe role roy", 30000, new Special_LuxuryTax());

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
