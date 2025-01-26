package by.tms.homeworkseven;

import by.tms.homeworkseven.fastfoodinterface.DeliveryProcessOrder;
import by.tms.homeworkseven.fastfoodinterface.ServiceDelivery.DeliveryProcessOrderImplementation;
import by.tms.homeworkseven.fastfoodinterface.ServiceDelivery.GetOrderImplementation;

public class MainApp {
    public static void main(String[] args) {

        GetOrderImplementation orderOne =
                new GetOrderImplementation("Mobile", new DeliveryProcessOrderImplementation());
        GetOrderImplementation orderTwo =
                new GetOrderImplementation("Internet", new DeliveryProcessOrder() {});
        GetOrderImplementation orderThree =
                new GetOrderImplementation("Other", new DeliveryProcessOrderImplementation());

        System.out.println("Mock order one: ");
        orderOne.createOrder();
        System.out.println("Mock order two: ");
        orderTwo.createOrder();
        System.out.println("Mock order three: ");
        orderThree.createOrder();
    }
}
