package by.tms.homeworkfour;
/*
Есть числовой массив. Необходимо вывести информацию о его элементах
a) Количество элементов
b) Сумма элементов
c) Максимальный элемент
d) Минимальный элемент
 */
public class HomeWorkFourTaskTwo {
    public static void main(String[] args) {
        int[] Integermassiv ={8,5,6,8,10,12,3,45,76,87,2,83,57,8,9};
        System.out.println("Number of array element " + Integermassiv.length);
        int result = 0;
        int ElementMassivMax = Integermassiv[0];
        int ElementMassivMin = Integermassiv[0];
        for (int i : Integermassiv) {
            result += i;
            if (ElementMassivMax < i) {
                ElementMassivMax = i;
            }
            if (ElementMassivMin > i) {
                ElementMassivMin = i;
            }

        }
        System.out.println("Sum of all elements " + result);
        System.out.println("Max element massiv " + ElementMassivMax);
        System.out.println("Min element massiv " + ElementMassivMin);

    }
}
