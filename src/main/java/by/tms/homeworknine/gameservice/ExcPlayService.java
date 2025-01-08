package by.tms.homeworknine.gameservice;



public class ExcPlayService extends Exception {
    public ExcPlayService(String message) {
        message ="Invalid value entered";
        System.out.println(message);
    }
}
