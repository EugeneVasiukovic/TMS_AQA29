package by.tms.homeworkeight.qulitycheckrepair;

import by.tms.homeworkeight.phone.Phone;

public  class PhoneQualityCheck extends QualityCheck {
    @Override
    public void check(Phone phone) {
        phone.call("123-456-7890");
        phone.play("Favorite Song");
        phone.firmware();
        System.out.println(phone.getClass().getSimpleName() + " check completed.");
    }
}

