package by.tms.homeworkfive;
/*
Необходимо создать класс Student со следующими полями
1) Имя
2) Фамилия
3) Количество лет
4) Количество лекций, которые посещает студент
В классе должны быть конструкторы
1) Принимающий имя и фамилию
2) Принимающий имя, фамилию и возраст
3) Принимающий все параметры
Так же в классе должны быть методы
1) Метод который возвращает полное имя и фамилию (имя + фамилия)
2) Метод который не возвращает значение, но выводит сообщение <<фамилия посещает N занятий>>

 */
public class Student {
    public String name;
    public String lastName;
    public int age;
    public int countOflecture;
    public  Student(String sName, String sLastName){
        name = sName;
        lastName = sLastName;
    }
    public Student(String sName, String sLastName, int sAge){
        name = sName;
        lastName = sLastName;
        age = sAge;

    }
    public Student( String name, String lastName, int age, int countOflecture){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.countOflecture =countOflecture;
    }
    public Student(){

    }

    public String returnNameLastName() {
        String nameLastNameStudent = "Name student: " + name + "\nLast name student: " + lastName;
        return nameLastNameStudent;

    }
    public void CountingActivities(String studentlastName, int CountOflecture){
        lastName = studentlastName;
        this.countOflecture = CountOflecture;
        System.out.println("Last name: " + studentlastName + "\nNumber of classes attended: " + CountOflecture);
    }
}
