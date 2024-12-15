package by.tms.homeworksix;

public class MainAppCreateProduct {
    public static void main(String[] args) {
        Product[] productList = {
                new Product("Iphone 12", true, TypeProduct.MOBILE),
                new Product("Iphone 17", false, TypeProduct.MOBILE),
                new Product("lg34512", true, TypeProduct.TV),
                new Product("Samsung123", true, TypeProduct.TV),
                new Product("Sony Bravia", true, TypeProduct.TV),
                new Product("Panasonic Viera", false, TypeProduct.TV),
                new Product("Bose SoundLink", true, TypeProduct.AUDIO),
                new Product("JBL Flip 5", true, TypeProduct.AUDIO),
                new Product("Sony WH-1000XM4", false, TypeProduct.AUDIO),
                new Product("Iphone 13", true, TypeProduct.MOBILE),
                new Product("Iphone 14", false, TypeProduct.MOBILE),
                new Product("Samsung Galaxy S21", true, TypeProduct.MOBILE),
                new Product("OnePlus 9", true, TypeProduct.MOBILE),
                new Product("Xiaomi Mi 11", false, TypeProduct.MOBILE),
                new Product("LG OLED55", true, TypeProduct.TV),
                new Product("Samsung QLED", true, TypeProduct.TV),
                new Product("Philips Ambilight", false, TypeProduct.TV),
                new Product("Yamaha YAS-209", true, TypeProduct.AUDIO),
                new Product("Harman Kardon Onyx", true, TypeProduct.AUDIO),
                new Product("Marshall Stanmore II", false, TypeProduct.AUDIO),
                new Product("Iphone 15", true, TypeProduct.MOBILE),
                new Product("Iphone 16", false, TypeProduct.MOBILE),
                new Product("Google Pixel 6", true, TypeProduct.MOBILE),
                new Product("Huawei P40", true, TypeProduct.MOBILE),
                new Product("Nokia 8.3", false, TypeProduct.MOBILE),
                new Product("Sony X900H", true, TypeProduct.TV),
                new Product("TCL 6-Series", true, TypeProduct.TV),
                new Product("Vizio P-Series", false, TypeProduct.TV),
                new Product("Sonos One", true, TypeProduct.AUDIO),
                new Product("Anker Soundcore", true, TypeProduct.AUDIO)

        };

        ServiceProduct serviceProduct = new ServiceProduct();
        int totalCostProductType = serviceProduct.printTypeProductOfTheAveregeCost(productList,TypeProduct.MOBILE);
        int numberProductStock = serviceProduct.printCoutProductIsAvailability(productList,TypeProduct.TV);

        System.out.println("The cost of all products of the specified type\n" + totalCostProductType);
        System.out.println("The number of products that are in stock\n" + numberProductStock);
        StaticService.stringIsInt(8,"123 compucter");
    }
}
