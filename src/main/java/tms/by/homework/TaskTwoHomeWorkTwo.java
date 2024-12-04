package tms.by.homework;
/*
Посчитать сколько нулей  будет  при  произведении всех чисел от 1 до 100
 */
public class TaskTwoHomeWorkTwo {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 5; i <= 100; i *=5) {

            if (i % 5 == 0) {
                counter += 100 / i;

            }

        }
        System.out.println("General count  zero " + counter);
    }
}
