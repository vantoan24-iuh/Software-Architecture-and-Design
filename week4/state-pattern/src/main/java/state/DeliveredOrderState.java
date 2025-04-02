package state;

import models.Order;


public class DeliveredOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng: " + order.getId() + " đã được giao thành công.");
    }

}
