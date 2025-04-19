package vn.edu.iuh.fit.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.orderservice.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
