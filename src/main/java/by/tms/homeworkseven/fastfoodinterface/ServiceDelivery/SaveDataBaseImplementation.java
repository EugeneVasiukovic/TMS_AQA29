package by.tms.homeworkseven.fastfoodinterface.ServiceDelivery;

import by.tms.homeworkseven.fastfoodinterface.SaveOrder;

public class SaveDataBaseImplementation implements SaveOrder {
    @Override
    public void saveOrderDataBase(String orderDetalis) {
        System.out.println("Save order to database");

    }
}
