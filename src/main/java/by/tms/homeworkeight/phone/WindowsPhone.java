package by.tms.homeworkeight.phone;

public class WindowsPhone extends Phone {
    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling from WindowsPhone to: " + phoneNumber);
    }

    @Override
    public void play(String playMusic) {
        super.play(playMusic);
    }

    @Override
    public void firmware() {
        System.out.println("Version WindowsPhone 10.0");
    }
}
