package by.tms.homeworkseven.fast_food_interface.ServiceDelivery;

import by.tms.homeworkseven.fast_food_interface.ManageOrder;

public class ManageOrderImplementation implements ManageOrder {
    @Override
    public void manageOrderPreparationProcess(String order){
        System.out.println("The order is being prepared");
    }
}
