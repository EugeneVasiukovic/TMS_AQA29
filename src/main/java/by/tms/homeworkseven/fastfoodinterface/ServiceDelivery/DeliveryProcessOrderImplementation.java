package by.tms.homeworkseven.fastfoodinterface.ServiceDelivery;

import by.tms.homeworkseven.fastfoodinterface.DeliveryProcessOrder;

public class DeliveryProcessOrderImplementation implements DeliveryProcessOrder {
    @Override
    public void deliveryProcessOrder(String orderDetails) {
        System.out.println("The order is being delivered to the customer's home: " + orderDetails);
    }

}
