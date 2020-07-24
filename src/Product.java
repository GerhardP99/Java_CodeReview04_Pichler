import java.util.ArrayList;

public class Product {
    private int maxStock = (int) (Math.random() * (15 - 0 + 1) + 0);
    private int productID;
    private int count = 1;
    private String productName;
    private String productDescription;
    private double productPrice;
    private ArrayList<Product> products = new ArrayList<>();
    enum productCategory{
        TShirts,
        Trousers,
        Shirts,
        Jackets,
        Accessories,
        Shorts,
        Hats,
        Shoes
    }

    public int getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(int maxStock) {
        this.maxStock = maxStock;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Product(){
        productID = count++;
    }

    @Override
    public String toString() {
        return  " Product ID: '" + productID + '\'' +
                " Product name: '" + productName + '\'' +
                " Product description: '" + productDescription + '\'' +
                " Stock: '" + maxStock + '\'' +
                " Product price: " + productPrice + "\n";
    }
}
