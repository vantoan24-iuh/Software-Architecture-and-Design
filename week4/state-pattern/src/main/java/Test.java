import models.Order;
import state.NewOrderState;

public class Test {
    public static void main(String[] args) {
        Order order1 = new Order(1234);
        System.out.println("## Đơn hàng: " + order1.getId());
        // Trạng thái ban đầu của đơn hàng
        order1.handleOrder();
        // Đơn hàng đã được chuyển sang trạng thái xử lý
        order1.handleOrder();
        // Đơn hàng đã được chuyển sang trạng thái giao hàng thành công
        order1.handleOrder();
        order1.cancelOrder();

        System.out.println("\n--------------------------------------------------\n");
        Order order2 = new Order(1234);
        System.out.println("## Đơn hàng: " + order2.getId());
        // Trạng thái ban đầu của đơn hàng
        order2.handleOrder();
        order2.cancelOrder();
        order2.handleOrder();

    }
}
