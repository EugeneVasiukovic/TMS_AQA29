package by.tms.homeworkeleven;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListOfUserApp {
    public static void main(String[] args) {
        Set<User> listOfUser = new HashSet<>();
        listOfUser.add(new User("John Smith", 28));
        listOfUser.add(new User("Emily Johnson", 34));
        listOfUser.add(new User("Michael Brown", 22));
        listOfUser.add(new User("Jessica Davis", 30));
        listOfUser.add(new User("David Wilson", 25));
        listOfUser.add(new User("David Wilson", 27));
        listOfUser.add(new User("James Taylor", 31));
        listOfUser.add(new User("Laura Anderson", 29));
        listOfUser.add(new User("Robert Thomas", 33));
        listOfUser.add(new User("Sophia Martinez", 26));

        System.out.println("User name: ");
        for (User i : listOfUser) {
            System.out.println(i.getName());
        }

        List<User> sortUserByAge = new ArrayList<>(listOfUser);
        sortUserByAge.sort(new UserComparator());

        System.out.println("Sorting user by age: ");
        for (User i : sortUserByAge) {
            System.out.println(i);
        }


    }
}
