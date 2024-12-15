package by.tms.homeworksix;

public enum TypeProduct {
    MOBILE(850),
    TV(1100),
    AUDIO(450);

    private  int coast;

    TypeProduct(int coast){
        this.coast =coast;
    }

    public int getCoast(){
        return coast;
    }
}
