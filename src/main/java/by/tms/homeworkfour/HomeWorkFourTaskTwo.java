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
        int[] integermassiv ={8,5,6,8,10,12,3,45,76,87,2,83,57,8,9};
        int result = 0;
        int elementMassivMax = integermassiv[0];
        int elementMassivMin = integermassiv[0];
        for (int i : integermassiv) {
            result += i;
            if (elementMassivMax < i) {
                elementMassivMax = i;
            }
            if (elementMassivMin > i) {
                elementMassivMin = i;
            }

        }
        System.out.println("Number of array element " + integermassiv.length);
        System.out.println("Sum of all elements " + result);
        System.out.println("Max element massiv " + elementMassivMax);
        System.out.println("Min element massiv " + elementMassivMin);

    }
}
