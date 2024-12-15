package by.tms.homeworksix;
/*
Необходимо реализовать сервис со следующими методами
1) Метод принимает на вход массив товаров и тип товара. Необходимо вернуть стоимость всех товаров указанного типа
2) Метод принимает на вход массив товаров и тип товара. Необходимо вернуть количество товаров, которые есть в наличии
 */
public class ServiceProduct {
    public int printTypeProductOfTheAveregeCost(Product[] productList, TypeProduct typeProduct){
        int sum = 0;
        for (Product product : productList) {
            if (product.getTypeProduct() == typeProduct) {
                sum += product.getCostOfTheProduct();

            }
        }
        return sum;
    }
    public int printCoutProductIsAvailability(Product[] products, TypeProduct typeProduct){
        int count = 0;
        for (Product i : products){
            if (i.isAvailability() == true && i.getTypeProduct() == typeProduct){
                count++;
            }
        }
        return count;
    }
}

