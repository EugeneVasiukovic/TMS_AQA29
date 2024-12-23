package by.tms.homeworkseven.fastfoodinterface.ServiceDelivery;

import by.tms.homeworkseven.fastfoodinterface.DeliveryProcessOrder;
import by.tms.homeworkseven.fastfoodinterface.GetOrder;
import by.tms.homeworkseven.fastfoodinterface.ManageOrder;
import by.tms.homeworkseven.fastfoodinterface.SaveOrder;


public class GetOrderImplementation implements GetOrder {

    private String methodOrderGet;
    private ValidatorGetOrder validator;
    private SaveOrder orderToDataBase;
    private ManageOrder manageOrder;
    private DeliveryProcessOrder deliveryProcessOrder;

    public GetOrderImplementation(String methodOrderGet, DeliveryProcessOrder deliveryProcessOrder) {
        this.methodOrderGet = methodOrderGet;
        this.validator = new ValidatorGetOrder();
        this.orderToDataBase = new SaveDataBaseImplementation();
        this.manageOrder = new ManageOrderImplementation();
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