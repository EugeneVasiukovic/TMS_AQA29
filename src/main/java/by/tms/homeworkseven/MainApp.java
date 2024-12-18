package by.tms.homeworkseven;

import by.tms.homeworkseven.fast_food_interface.DeliveryProcessOrder;
import by.tms.homeworkseven.fast_food_interface.ServiceDelivery.DeliveryProcessOrderImplementation;
import by.tms.homeworkseven.fast_food_interface.ServiceDelivery.GetOrderImplementation;

public class MainApp {
    public static void main(String[] args) {

        GetOrderImplementation orderOne =
                new GetOrderImplementation("Mobile", new DeliveryProcessOrderImplementation());
        GetOrderImplementation orderTwo =
                new GetOrderImplementation("Internet", new DeliveryProcessOrder() {});
        GetOrderImplementation orderThree =
                new GetOrderImplementation("Other", new DeliveryProcessOrderImplementation());

        System.out.println("Mock order one: ");
        orderOne.checkMethodGetOrder();
        System.out.println("Mock order two: ");
        orderTwo.checkMethodGetOrder();
        System.out.println("Mock order three: ");
        orderThree.checkMethodGetOrder();
    }
}
