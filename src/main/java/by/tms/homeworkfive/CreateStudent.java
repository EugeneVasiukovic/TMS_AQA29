package by.tms.homeworkfive;
/*
В основном классе приложения создать 3 студентов, используя каждый из конструкторов.
На каждом объекте выполнить метод по получению полного имени, результат вывести в консоль.
На каждом объекте выполнить метод по печати, сколько занятий посещает студент.
Попробуйте любому студенту поменять количество занятий, которые он посещает.
Снова выведите информацию об этом студенте.
 */

import java.util.Arrays;

public class CreateStudent {
    public static void main(String[] args) {
        Student student= new Student();
        Student studentEugene = new Student("Eugene", "Vasiukovich");
        Student studentAnna = new Student("Anna", "Ivanova",22);
        Student studentVika = new Student("Vika", "Petrova", 28, 5);
        String studentlistEugene = studentEugene.getFullName();
        String studentListAnna = studentAnna.getFullName();
        String studentListVika = studentVika.getFullName();


        System.out.println(studentlistEugene);
        System.out.println(studentListAnna);
        System.out.println(studentListVika);

        student.printLectureCount(studentEugene.lastName, 20);
        student.printLectureCount(studentVika.lastName, studentVika.countOflecture);
        student.printLectureCount(studentAnna.lastName,85);
        student.printLectureCount(studentVika.lastName,150);
            }
}

