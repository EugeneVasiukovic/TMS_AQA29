package by.tms.homeworkfive;
/*
В основном классе приложения создать 3 студентов, используя каждый из конструкторов.
На каждом объекте выполнить метод по получению полного имени, результат вывести в консоль.
На каждом объекте выполнить метод по печати, сколько занятий посещает студент.
Попробуйте любому студенту поменять количество занятий, которые он посещает.
Снова выведите информацию об этом студенте.
 */

public class CreateStudent {
    public static void main(String[] args) {
        Student student= new Student();
        Student studentEugene = new Student("Eugene", "Vasiukovich");
        Student studentAnna = new Student("Anna", "Ivanova",22);
        Student studentVika = new Student("Vika", "Petrova", 28, 5);
        String studentlistEugene = studentEugene.returnNameLastName();
        String studentListAnna = studentAnna.returnNameLastName();
        String studentListVika = studentVika.returnNameLastName();


        System.out.println(studentlistEugene);
        System.out.println(studentListAnna);
        System.out.println(studentListVika);

        student.CountingActivities(studentEugene.lastName, 20);
        student.CountingActivities(studentAnna.lastName,85);
        student.CountingActivities(studentVika.lastName, 30);

        student.CountingActivities(studentAnna.lastName,150);



    }
}
