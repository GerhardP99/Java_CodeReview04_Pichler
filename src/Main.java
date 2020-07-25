import java.io.*;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main extends UserInterface {
    private static final String filePath = "c://temp//report.txt"; // string with the filepath

    static HashMap<String, Product> products = new HashMap<>(); // creating the hashmaps
    static HashMap<String, Shop> shops = new HashMap<>();
    static HashMap<Integer, User> users = new HashMap<>();


    public static void main(String[] args) throws InterruptedException, FileNotFoundException {


/*----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------*/
         // printMenu();
        // To print the menu just remove the comment
/*----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------*/
        int waitTime = 0; // waiting time between the users buying
/*----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------*/
        Product product1 = new Product(); // creating the products and giving them name, description, price, maxstock and category
        product1.setProductName("Voeslauer ");
        product1.setProductDescription("Fresh Water");
        product1.setProductPrice(1.25);
        product1.getMaxStock(); // gets randomly calculated
        product1.setProductCategory("Consumables");
        Product product2 = new Product();
        product2.setProductName("Skull T-shirt ");
        product2.setProductDescription("T-shirt with a skull logo");
        product2.setProductPrice(12.25);
        product2.getMaxStock();
        product2.setProductCategory("T-Shirts");
        Product product3 = new Product();
        product3.setProductName("Red/White Jacket ");
        product3.setProductDescription("Jacket with the colors Red and white");
        product3.setProductPrice(35.55);
        product3.getMaxStock();
        product3.setProductCategory("Jackets");
        Product product4 = new Product();
        product4.setProductName("Monster Energy ");
        product4.setProductDescription("Soft Drink");
        product4.setProductPrice(1.99);
        product4.getMaxStock();
        product4.setProductCategory("Consumables");
        Product product5 = new Product();
        product5.setProductName("Nike jordan 1 ");
        product5.setProductDescription("Shoes from the basketball player michael jordan");
        product5.setProductPrice(169.99);
        product5.getMaxStock();
        product5.setProductCategory("Shoes");

        products.put(product1.getProductName(), product1); // putting the products into the hashmap
        products.put(product2.getProductName(), product2);
        products.put(product3.getProductName(), product3);
        products.put(product4.getProductName(), product4);
        products.put(product5.getProductName(), product5);
/*----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------*/
        Shop shop1 = new Shop(); // creating a new Shop
        shop1.setShopName("Alibabas Laden"); // setting a name for the shop
        shops.put(shop1.getShopName(),shop1); // putting the shop into the hashmap

        shop1.addProduct(product1); // adding the products to the shop
        shop1.addProduct(product2);
        shop1.addProduct(product3);
        shop1.addProduct(product4);
        shop1.addProduct(product5);
/*----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------*/
        User user1 = new User(); // creating the users
        user1.setFirstName("Heinrich");
        user1.setLastName("Müller");
        user1.setAddress("Heinrichstraße 10/12/5 Heinrichland");
        user1.seteMail("heinrich.müller@heinrichsemail.net");
        user1.setPhoneNumber("0668/112334");
        user1.setZipCode("222512");
        User user2 = new User();
        user2.setFirstName("Charlett");
        user2.setLastName("Herolds");
        user2.setAddress("Charlettstraße 13/1 Heroldsland");
        user2.seteMail("charlett.herolds@gmail.com");
        user2.setPhoneNumber("0767/612351");
        user2.setZipCode("110234");
        User user3 = new User();
        user3.setFirstName("Alex");
        user3.setLastName("Kernbach");
        user3.setAddress("Alexstraße 15/11/33/ Kernsland");
        user3.seteMail("kernbach.alex@yahoooo.do");
        user3.setPhoneNumber("0898/854234");
        user3.setZipCode("09843");
        User user4 = new User();
        user4.setFirstName("Helmut");
        user4.setLastName("Keller");
        user4.setAddress("Kellerstraße 10/1 Hellensland");
        user4.seteMail("kellers.paradiesmail@gmx.de");
        user4.setPhoneNumber("0005/666123");
        user4.setZipCode("12512");
        User user5 = new User();
        user5.setFirstName("Damien");
        user5.setLastName("Hart");
        user5.setAddress("Hartsstraße 99/12 Deutschland");
        user5.seteMail("hart.dam@millersmail.net");
        user5.setPhoneNumber("99982/88512");
        user5.setZipCode("456452");
        User user6 = new User();
        user6.setFirstName("Wirld");
        user6.setLastName("Kornel");
        user6.setAddress("Bahnhofkreiselmillersstraße 1/2/6 Österreich");
        user6.seteMail("my.mail@hugobetrugo.kk");
        user6.setPhoneNumber("1293/097434");
        user6.setZipCode("2512");

        users.put(user1.getUserID(),user1); // putting the users into the hashmap
        users.put(user2.getUserID(),user2);
        users.put(user3.getUserID(),user3);
        users.put(user4.getUserID(),user4);
        users.put(user5.getUserID(),user5);
        users.put(user6.getUserID(),user6);
/*----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------*/

        product1.stockBelowFive(); // calling the method from "product.java" that checks if the stock is below 5
        product2.stockBelowFive();
        product3.stockBelowFive();
        product4.stockBelowFive();
        product5.stockBelowFive();

        Shop.printProducts(); // printing the products that the shop has stored

        printReport(); // prints the output to the file "report.txt" in C:\temp

        TimeUnit.SECONDS.sleep(waitTime);
        buyProduct(); // calling the method where a random users buys a random product
        TimeUnit.SECONDS.sleep(waitTime);
        buyProduct();
        TimeUnit.SECONDS.sleep(waitTime);
        buyProduct();
        TimeUnit.SECONDS.sleep(waitTime);
        buyProduct();
    }

    public static boolean buyProduct(){ // method to let a random user buy a random product
        Object[] userValues = users.entrySet().toArray();
        Object userValue = userValues[new Random().nextInt(userValues.length)];
        Object[] productValues = products.entrySet().toArray();
        Object productValue = productValues[new Random().nextInt(productValues.length)];
        System.out.println("UserID: "+userValue+" Bought: "+productValue);
        return false;
    }

    public static void printReport() throws InterruptedException, FileNotFoundException { // method to print the output to the report.txt
        System.out.print("\nWriting the purchase History into the file report.txt located in: c://temp//");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".\n");
        PrintStream out = new PrintStream(new FileOutputStream(filePath));
        System.setOut(out);
    }
}
