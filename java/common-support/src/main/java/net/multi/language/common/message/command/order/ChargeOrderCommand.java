package net.multi.language.common.message.command.order;


import net.multi.language.common.marker.message.Channel;
import net.multi.language.common.marker.message.MessageDetails;
import net.multi.language.common.marker.message.Service;
import net.multi.language.common.message.AbstractCommand;

@MessageDetails(
        publisher = Service.ORDER_SERVICE,
        subscribers = Service.BILLING_SERVICE,
        channel = Channel.CHARGE_ORDER
)
public class ChargeOrderCommand extends AbstractCommand {

    private static final String NAME = "ChargeOrder";

    private final long customerId;
    private final long orderId;
    private final double orderTotal;
    private final Currency currency;

    public ChargeOrderCommand(final long messageId, final long customerId, final long orderId, final double orderTotal,
                              final Currency currency) {
        super(messageId);
        this.customerId = customerId;
        this.orderId = orderId;
        this.orderTotal = orderTotal;
        this.currency = currency;
    }

    public long getCustomerId() {
        return customerId;
    }

    public long getOrderId() {
        return orderId;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public enum Currency {
        EUR,
        USD
    }

    @Override
    public String toString() {
        return "customerId: " + customerId +
                ", orderId: " + orderId +
                ", orderTotal: " + orderTotal +
                ", currency: " + currency +
                '}';
    }
}
