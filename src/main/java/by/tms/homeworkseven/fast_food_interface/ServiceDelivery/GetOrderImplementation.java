package by.tms.homeworkseven.fast_food_interface.ServiceDelivery;

import by.tms.homeworkseven.fast_food_interface.DeliveryProcessOrder;
import by.tms.homeworkseven.fast_food_interface.GetOrder;
import by.tms.homeworkseven.fast_food_interface.ManageOrder;
import by.tms.homeworkseven.fast_food_interface.SaveOrderToDataBase;

/*
1) Создаем интерфейс для получения заказа
1.1) Необходима реализация, которая принимает заказ онлайн
1.2) Необходима реализация, которая принимает по телефону
 */
public class GetOrderImplementation implements GetOrder {

    private String methodOrderGet;
    private ValidatorGetOrder validator;
    private SaveOrderToDataBase orderToDataBase;
    private ManageOrder manageOrder;
    private DeliveryProcessOrder deliveryProcessOrder;

    public GetOrderImplementation(String methodOrderGet, DeliveryProcessOrder deliveryProcessOrder) {
        this.methodOrderGet = methodOrderGet;
        this.validator = new ValidatorGetOrder();
        this.orderToDataBase = new SaveDataBaseImplementation();
        this.manageOrder = new ManageOrderImplementation();
        this.deliveryProcessOrder = deliveryProcessOrder;
    }


    public void checkMethodGetOrder() {
        if (validator.validateMethodGetOrder(methodOrderGet)) {
            acceptOrder(methodOrderGet);
            orderToDataBase.saveOrderDataBase(methodOrderGet);
            manageOrder.manageOrderPreparationProcess(methodOrderGet);
            deliveryProcessOrder.deliveryProcessOrder(methodOrderGet);
        } else {
            System.out.println("The order has not been accepted");
        }
    }

    @Override
    public void acceptOrder(String methodGetOrder) {
        if (methodGetOrder.equals("Mobile")) {
            System.out.println("The order was accepted by phone");
        } else if (methodGetOrder.equals("Internet")) {
            System.out.println("The order was accepted over the Internet");
        }
    }
}