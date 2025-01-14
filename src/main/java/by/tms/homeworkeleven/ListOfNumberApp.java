package by.tms.homeworkeleven;

import java.util.HashMap;
import java.util.Map;


public class ListOfNumberApp {
    public static void main(String[] args) {
        Integer[] listOfNumber = {1, 2, 2, 3, 4, 5, 6, 8, 8, 6, 4, 2, 9, 9, 3, 5, 6, 8, 7, 5, 2, 3};
        Map<Integer, Integer> set = new HashMap<>();

        for (Integer num : listOfNumber) {
            set.put(num, set.getOrDefault(num, 0) + 1);
        }
        System.out.println("Unique numbers and the number of their repetitions: \n" + set);


    }


}
