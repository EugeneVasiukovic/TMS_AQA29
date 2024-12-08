package by.tms.homeworkfour;

import java.util.Arrays;

/*
Есть два числовых масива разной длинны(без дубликатов в рамках каждого массива).
Необходимо вывести в  терминал все элементы, которые встречаются в обоих массивах
 */
public class HomeWorkFourTaskOne {
    public static void main(String[] args) {
        int[] massivIntegerOne = {10,20,30,50,60,70,80,90,100};
        int[] massivIntegerTwo = {1,2,10,5,6,60,7,90};
        for (int i = 0; i < massivIntegerOne.length; i++){
            for (int j = 0; j < massivIntegerTwo.length; j++){
                if (massivIntegerOne[i] == massivIntegerTwo[j]){
                    System.out.println("Elements that are present in two arrays \n"+ massivIntegerOne[i]);
                    break;
            }

            }
        }
    }
}
