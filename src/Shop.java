import java.util.ArrayList;

public class Shop {
    private String shopName;
    private String shopAdress;
    private ArrayList<Product> products = new ArrayList<>();


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAdress() {
        return shopAdress;
    }

    public void setShopAdress(String shopAdress) {
        this.shopAdress = shopAdress;
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

    public void printProducts() {
        System.out.println(products);
    }
}