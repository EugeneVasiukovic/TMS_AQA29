package by.tms.homeworknine;

import by.tms.homeworknine.gameservice.PlayService;
import by.tms.homeworknine.gameservice.implgameservice.PlayServiceImpl;
import by.tms.homeworknine.gameservice.ExcPlayService;
import by.tms.homeworknine.userservice.User;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter account amount:");
        int balance = scanner.nextInt();
        User user = new User(name, balance);
        PlayService playService = new PlayServiceImpl();

        while (user.getBalance() > 0) {
            System.out.println("Place your bet:");
            int bet = scanner.nextInt();
            try {
                playService.validate(user, bet);
                System.out.println("Enter the number you are trying to guess (from 1 to 5):");
                int number = scanner.nextInt();
                boolean win = playService.play(number, user);
                if (number == -1) {
                    break;
                }
                if (win) {
                    System.out.println("You guessed it! Your balance has been increased by " + bet + " USD.");
                    playService.changeWallet(bet, user);
                } else {
                    System.out.println("You guessed wrong. Your balance has been reduced by " + bet + " USD.");
                    playService.changeWallet(-bet, user);
                }
                System.out.println("Your current balance:: " + user.getBalance() + " USD.");
                if (user.getBalance() <= 0) {
                    System.out.println("Your balance is 0. The game is over.");
                    break;
                }
            } catch (ExcPlayService e) {
                System.out.println(e.getMessage());
            }
        }
    }
}