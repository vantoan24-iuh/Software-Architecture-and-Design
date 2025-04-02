package state;

import models.Order;

public class ProcessingOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng: " + order.getId() + " đang được xử lý đóng gói và vận chuyển.");
        order.setState(new DeliveredOrderState());
        System.out.println("Đơn hàng: " + order.getId() + " đã được vận chuyển và được chuyển sang trạng thái tiếp theo.");
    }

}
