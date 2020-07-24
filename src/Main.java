import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    static HashMap<Integer, Product> products = new HashMap<>();
    static HashMap<String, Shop> shops = new HashMap<>();
    static HashMap<Integer, User> users = new HashMap<>();


    public static void main(String[] args) {

        Shop shop1 = new Shop();
        shop1.setShopName("Alibabas Laden");
        shops.put(shop1.getShopName(),shop1);

        Product product1 = new Product();
        product1.setProductName("Voeslauer");
        product1.setProductDescription("Fresh Water");
        product1.setProductPrice(1.25);
        product1.getMaxStock();
        Product product2 = new Product();
        product2.setProductName("Milka");
        product2.setProductDescription("Chocolate");
        product2.setProductPrice(2.21);
        product2.getMaxStock();
        Product product3 = new Product();
        product3.setProductName("Toast");
        product3.setProductDescription("Bred");
        product3.setProductPrice(3.25);
        product3.getMaxStock();
        Product product4 = new Product();
        product4.setProductName("Coca-Cola");
        product4.setProductDescription("Soft Drink");
        product4.setProductPrice(1.55);
        product4.getMaxStock();
        Product product5 = new Product();
        product5.setProductName("Landjaeger");
        product5.setProductDescription("Meat");
        product5.setProductPrice(3.65);
        product5.getMaxStock();

        products.put(product1.getProductID(), product1);
        products.put(product2.getProductID(), product2);
        products.put(product3.getProductID(), product3);
        products.put(product4.getProductID(), product4);
        products.put(product5.getProductID(), product5);


        shop1.addProduct(product1);
        shop1.addProduct(product2);
        shop1.addProduct(product3);
        shop1.addProduct(product4);
        shop1.addProduct(product5);
        shop1.printProducts();

        /*products.put(Product.productID, Product.products);*/
    }
}
