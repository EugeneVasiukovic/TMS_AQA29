package by.tms.homeworksix;
/*
Необходимо создать статический метод, который принимает строку и число. Его задача вывести строку указанное количество раз.
Вызвать данный метод необходимо через имя класса, без создания объекта.
 */
public class StaticService {
    public static void stringIsInt(int i, String printStr){
        for (int j = 0 ; j <= i; j++){
            System.out.println(printStr);
        }
    }

}
