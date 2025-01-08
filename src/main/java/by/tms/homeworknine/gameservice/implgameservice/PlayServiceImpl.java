package by.tms.homeworknine.gameservice.implgameservice;

import by.tms.homeworknine.gameservice.PlayService;
import by.tms.homeworknine.userservice.User;
import by.tms.homeworknine.gameservice.ExcPlayService;
import java.util.Random;

public class PlayServiceImpl implements PlayService {
    private static final int MAX_BET = 100;

    @Override
    public void validate(User user, int bet) throws ExcPlayService {
        if (bet > user.getBalance()) {
            throw new ExcPlayService("The bet is greater than the amount in the user's account");
        }
        if (bet > MAX_BET) {
            throw new ExcPlayService("The bet is more than the maximum allowable - 100 USD.");
        }
    }

    @Override
    public boolean play(int number, User user) throws ExcPlayService {
        if (number < -1 || number > 5) {
            throw new ExcPlayService("The number must be between 1 and 5.");
        }
        if (number == -1) {
            System.out.println("User leaves the game");
            return false;
        }
        Random random = new Random();
        int randomNumber = random.nextInt(6);
        return number == randomNumber;
    }

    @Override
    public void changeWallet(int changeBalance, User user) {
        user.setBalance(user.getBalance() + changeBalance);
    }
}