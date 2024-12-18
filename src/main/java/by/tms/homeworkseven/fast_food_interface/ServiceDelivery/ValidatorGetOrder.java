package by.tms.homeworkseven.fast_food_interface.ServiceDelivery;

public class ValidatorGetOrder {
    public boolean validateMethodGetOrder(String method) {
        return method.equals("Mobile") || method.equals("Internet");
    }
}
