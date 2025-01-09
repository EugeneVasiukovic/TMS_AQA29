package by.tms.homeworkseven.fastfoodinterface;

public interface DeliveryProcessOrder {
    default void deliveryProcessOrder(String orderDetails){
        System.out.println("Pick up the order yourself at the restaurant");
    }
}
