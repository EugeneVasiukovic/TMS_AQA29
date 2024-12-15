package by.tms.homeworksix;
/*
Создайте класс продукт со следующими полями
1) Тип товара (enum - MOBILE, TV, AUDIO)
2) Стоимость товара
3) Наименование - string
4) Наличие - boolean
 */
public class Product {
    private int costOfTheProduct;
    private String nameOfTheProduct;
    private boolean availability;
    private TypeProduct typeProduct;

    public Product(String nameOfTheProduct, boolean availability, TypeProduct typeProduct) {
        this.nameOfTheProduct = nameOfTheProduct;
        this.availability = availability;
        this.typeProduct = typeProduct;
        costOfTheProduct = typeProduct.getCoast();
    }

    public int getCostOfTheProduct() {
        return costOfTheProduct;
    }

    public void setCostOfTheProduct(int costOfTheProduct) {
        this.costOfTheProduct = costOfTheProduct;
    }

    public String getNameOfTheProduct() {
        return nameOfTheProduct;
    }

    public void setNameOfTheProduct(String nameOfTheProduct) {
        this.nameOfTheProduct = nameOfTheProduct;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }
}
