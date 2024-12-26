package by.tms.homeworkeight;

import by.tms.homeworkeight.phone.Android;
import by.tms.homeworkeight.phone.Apple;
import by.tms.homeworkeight.phone.Phone;
import by.tms.homeworkeight.phone.Windows;
import by.tms.homeworkeight.qulitycheckrepair.PhoneQualityCheck;
import by.tms.homeworkeight.qulitycheckrepair.QualityCheck;

public class MainApp {
    public static void main(String[] args) {
        Phone applePhone = new Apple();
        Phone androidPhone = new Android();
        Phone windowsPhone = new Windows();

        QualityCheck qualityCheck = new PhoneQualityCheck();
        System.out.println("mock one Iphone: ");
        qualityCheck.check(applePhone);
        System.out.println("mock two Android: ");
        qualityCheck.check(androidPhone);
        System.out.println("mock three WindowsPhone: ");
        qualityCheck.check(windowsPhone);

        Phone phone = new Phone() {
            @Override
            public void call(String phoneNumber) {
                System.out.println("Calling from AnonymousPhone to: " + phoneNumber);
            }

            @Override
            public void play(String playMusic) {
                System.out.println("Playing music on AnonymousPhone: " + playMusic);
            }

            @Override
            public void firmware() {
                System.out.println("Version AnonymousPhone 1.0");
            }
        };
        qualityCheck.check(phone);
    }
}
