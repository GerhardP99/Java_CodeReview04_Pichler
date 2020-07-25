import java.util.ArrayList;

public class Shop {
    private static String shopName;
    private String shopAddress;
    private static ArrayList<Product> products = new ArrayList<>();


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAdress() {
        return shopAddress;
    }

    public void setShopAdress(String shopAdress) {
        this.shopAddress = shopAdress;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }


    public Shop(){

    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public static void printProducts() {
        System.out.println("\u001B[33m"+"\nShop: "+"\u001B[0m"+"\u001B[34m"+shopName+"\u001B[0m");
        System.out.println(products);
    }
}