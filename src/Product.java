import java.util.ArrayList;

public class Product {
    private int maxStock = (int) (Math.random() * (15 - 1 + 1) + 1);
    private int productID;
    private String productName;
    private String productDescription;
    private double productPrice;
    private ArrayList<Product> products = new ArrayList<>();
    private int reduceStock = this.maxStock-1;
    private String productCategory;


    public void stockBelowFive() { // method that checks if the maxStock is below 5
        if (maxStock < 5) {
            System.out.println("\u001B[31m"+"\nPRODUCT RUNNING OUT OF STOCK"+"\u001B[0m");
            System.out.println("The stock of " + productName + "is below 5!");
        }
    }

    public int getReduceStock() {
        return reduceStock;
    }

    public void setReduceStock(int reduceStock) {
        this.reduceStock = reduceStock;
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

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Product(){
        int min = 1;
        int max = 1000;
        this.productID = (int) (Math.random() * (max - min + 1) + min);
    }


    @Override
    public String toString() {
        return  " Product ID: '" + productID + '\'' +
                " | Product name: '" + productName + '\'' +
                " | Product description: '" + productDescription + '\'' +
                " | Stock: '" + maxStock + '\'' +
                " | Product price: " + productPrice + "€" +
                " | Product category: " + productCategory + "\n";
    }
}
