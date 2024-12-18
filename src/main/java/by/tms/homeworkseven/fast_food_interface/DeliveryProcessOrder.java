package by.tms.homeworkseven.fast_food_interface;

public interface DeliveryProcessOrder {
    default void deliveryProcessOrder(String orderDetails){
        System.out.println("Pick up the order yourself at the restaurant");
    }
}
