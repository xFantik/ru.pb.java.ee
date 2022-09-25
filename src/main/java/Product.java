import java.util.Random;

public class Product {
    private final static String[] testProd = {"Potato", "Carrot", "Onion", "Garlic", "Parsley", "Dill", "Bananas", "Lemon", "Butter", "Kefir", "Sourcream", "Cottagecheese", "Cheese", "Mustard", "Raspberryjam", "TomatopasteCanned", "fish", "Cannedpeas", "Cannedcorn", "Condensedmilk", "Honey"};

    private int id;
    private String title;
    private float cost;


    public Product(int id, String title, float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }


    public static Product getTestProduct() {
        Random r = new Random();
        return new Product(r.nextInt(1000000), testProd[r.nextInt(testProd.length - 1)], r.nextInt(100000));

    }

    @Override
    public String toString() {
        return
                title + ": " +
                        "id=" + id +
                        ", cost=" + cost;
    }
}
