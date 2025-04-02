
package state;

import models.Order;

public class CancelOrderState implements OrderState{
    @Override
    public void handleOrder(Order order) {
        System.out.println("Đơn hàng: " + order.getId() + " đã được hủy và hoàn tiền thành công");
    }

}
