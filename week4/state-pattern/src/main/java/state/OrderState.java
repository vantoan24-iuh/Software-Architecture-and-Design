
package state;

import models.Order;

public interface OrderState {

    void handleOrder(Order order);
}
