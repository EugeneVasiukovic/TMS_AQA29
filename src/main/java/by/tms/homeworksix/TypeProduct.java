package by.tms.homeworksix;

public enum TypeProduct {
    MOBILE(850),
    TV(1100),
    AUDIO(450);

    private  int cost;

    TypeProduct(int cost){
        this.cost =cost;
    }

    public int getCoast(){
        return cost;
    }
}
