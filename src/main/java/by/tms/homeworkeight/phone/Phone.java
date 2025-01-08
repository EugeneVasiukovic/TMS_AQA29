package by.tms.homeworkeight.phone;

public abstract class Phone {
    public void call(String phoneNumber) {
        System.out.println("A number is calling you: " + phoneNumber);
    }

    public void play(String playMusic) {
        System.out.println("A melody is playing: " + playMusic);
    }

    public abstract void firmware();
}

