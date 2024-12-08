package by.tms.homeworktwo;

import java.util.Scanner;

/*
Пользователь по очереди вводит свои оцнки по предметам.предметов всего 10(всегда).
После каждого ввода системы должна расспечатать следующую инфомацию
1) Сколько оценок было введено
2) Срелнее арифметическое всех оценок
3)Сколько оценок осталось ввести
 */
public class HomeWorkTwoTaskThree {
        public static void main(String[] args) {
            float saveValueAssessment = 0;
            for (int i = 1; i <= 10; i++) {
                Scanner assessment = new Scanner(System.in);
                System.out.println("Enter your rating: ");
                float valueAssessment = assessment.nextFloat();
                saveValueAssessment += valueAssessment;
                float averageRetings = saveValueAssessment / i;
                int CountRatings = 10 - i;
                System.out.println("How many ratings were entered?\n " + i);
                System.out.println("Output of the average arephmitic\n" + averageRetings);
                System.out.println("How many ratings are left to enter?\n" + CountRatings);


            }
        }
    }