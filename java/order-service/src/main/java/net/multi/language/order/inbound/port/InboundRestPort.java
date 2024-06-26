package net.multi.language.order.inbound.port;

import net.multi.language.common.dto.order.OrderDTO;
import net.multi.language.common.marker.port.InboundPort;

public interface InboundRestPort extends InboundPort {

    void createOrder(OrderDTO orderDTO);

    void chargeOrder(long customerId, long orderId);
}
