package by.tms.homeworknine.gameservice;
import by.tms.homeworknine.userservice.User;

public interface PlayService {
    void validate(User user, int bet) throws ExcPlayService;
    boolean play(int number, User user) throws ExcPlayService;
    void changeWallet(int changeBalance, User user);
}
