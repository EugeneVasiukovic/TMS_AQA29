package by.tms.homeworkseven.fast_food_interface.ServiceDelivery;

import by.tms.homeworkseven.fast_food_interface.SaveOrderToDataBase;

public class SaveDataBaseImplementation implements SaveOrderToDataBase {
    @Override
    public void saveOrderDataBase(String orderDetalis) {
        System.out.println("Save order to database");

    }
}
