package by.tms.homeworkseven.fast_food_interface.ServiceDelivery;

import by.tms.homeworkseven.fast_food_interface.DeliveryProcessOrder;

public class DeliveryProcessOrderImplementation implements DeliveryProcessOrder {
    @Override
    public void deliveryProcessOrder(String orderDetails) {
        System.out.println("The order is being delivered to the customer's home: " + orderDetails);
    }

}
