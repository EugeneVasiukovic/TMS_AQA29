package by.tms.homeworkseven.fastfoodinterface.ServiceDelivery;

public class ValidatorGetOrder {
    public boolean validateMethodGetOrder(String method) {
        return method.equals("Mobile") || method.equals("Internet");
    }
}
