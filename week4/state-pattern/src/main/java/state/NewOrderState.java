package state;

import models.Order;


public class NewOrderState implements OrderState{
    @Override
    public void handleOrder(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng: " + order.getId() + " đã được tạo mới.");
        order.setState(new ProcessingOrderState());
        System.out.println("Đơn hàng: " + order.getId() + " đã được chuyển sang trạng thái xử lý.");
    }

}
