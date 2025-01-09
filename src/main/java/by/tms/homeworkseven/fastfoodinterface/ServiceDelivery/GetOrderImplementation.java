package by.tms.homeworkseven.fastfoodinterface.ServiceDelivery;

import by.tms.homeworkseven.fastfoodinterface.DeliveryProcessOrder;
import by.tms.homeworkseven.fastfoodinterface.GetOrder;
import by.tms.homeworkseven.fastfoodinterface.ManageOrder;
import by.tms.homeworkseven.fastfoodinterface.SaveOrder;


public class GetOrderImplementation implements GetOrder {

    private String methodOrderGet;
    private DeliveryProcessOrder deliveryProcessOrder;

    SaveOrder  orderToDataBase = new SaveDataBaseImplementation();
    ManageOrder manageOrder = new ManageOrderImplementation();
    ValidatorGetOrder validator = new ValidatorGetOrder();

    public GetOrderImplementation(String methodOrderGet, DeliveryProcessOrder deliveryProcessOrder) {
        this.methodOrderGet = methodOrderGet;
        this.deliveryProcessOrder = deliveryProcessOrder;
    }

    public void acceptOrder(String methodGetOrder) {
        if (methodGetOrder.equals("Mobile")) {
            System.out.println("The order was accepted by phone");
        } else if (methodGetOrder.equals("Internet")) {
            System.out.println("The order was accepted over the Internet");
        }
    }

    @Override
    public void createOrder() {
        if (validator.validateMethodGetOrder(methodOrderGet)) {
            acceptOrder(methodOrderGet);
            orderToDataBase.saveOrderDataBase(methodOrderGet);
            manageOrder.manageOrderPreparationProcess(methodOrderGet);
            deliveryProcessOrder.deliveryProcessOrder(methodOrderGet);
        } else {
            System.out.println("The order has not been accepted");
        }
    }

}