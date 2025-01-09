package by.tms.homeworkseven.fastfoodinterface.ServiceDelivery;

import by.tms.homeworkseven.fastfoodinterface.ManageOrder;

public class ManageOrderImplementation implements ManageOrder {
    @Override
    public void manageOrderPreparationProcess(String order){
        System.out.println("The order is being prepared");
    }
}
