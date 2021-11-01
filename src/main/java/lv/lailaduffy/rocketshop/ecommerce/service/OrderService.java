package lv.lailaduffy.rocketshop.ecommerce.service;


import lv.lailaduffy.rocketshop.ecommerce.repository.Order;
import lv.lailaduffy.rocketshop.ecommerce.repository.OrderProduct;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
public interface OrderService {

    @NotNull Iterable<Order> getAllOrders();

    Order create(@NotNull(message = "The order cannot be null.") @Valid Order order);

    void update(@NotNull(message = "The order cannot be null.") @Valid Order order);
}
