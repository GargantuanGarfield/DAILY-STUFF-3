// SuperStore Exercise: Access Modifiers & Object Modeling Focus

// TODO: Define a class called Product with:
class Product{
    // - A protected String field called name
    protected String name;
    // - A protected double field called price
    protected double price;
    // - A private final int productId
    private final int productId;
    // - A public static int nextId to help generate unique IDs
    public static int nextId = 1001;
    // - A constructor that sets name, price, and assigns a unique ID
    Product(String name, double price){
        this.name = name;
        this.price = price;
        this.productId = nextId++;
    }

    // - Public getters for all fields
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getProductId(){
        return this.productId;
    }
    public int getNextId(){
        return nextId;
    }


    // - Override toString() to return formatted product details
    @Override
    public String toString(){
        return "Name: " + this.name + "\nPrice: " + this.price + "\nProduct Id: " + this.productId + "\n";
    }
    // - Override equals(Object o) to compare name and productId
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Product)) return false;
        return ((Product) o).name.equals(this.name) && ((Product) o).productId == this.productId;
    }
}


// TODO: Define a subclass Electronics that extends Product
class Electronics extends Product{
    // - Add a private String field called brand
    private String brand;
    // - Add a private boolean field called hasBattery
    private boolean hasBattery;
    // - Constructor takes all fields and uses super for shared ones
    Electronics(String name, double price, String brand, boolean hasBattery){
        super(name, price);
        this.brand = brand;
        this.hasBattery = hasBattery;
    }
    // - Override toString() to include brand and battery status
    @Override
    public String toString(){
        return "Name: " + this.name + "\nPrice: " + this.price + "\nProduct Id: " + super.getProductId() + "\nBrand: " + this.brand + "\nHas Bettery?????: " + this.hasBattery + "\n";
    }

    final void warrantyInfo(){
        System.out.println("Brotha.... you will NEVER have a warranty, you break it you buy it ykwim?????? NO warranty for you gamer...... .... ........ :3:3:3:3:3:3:3:3:3:3");
    }
}


// TODO: Define a subclass Grocery that extends Product
class Grocery extends Product{
    // - Add a private double field called weight (in kg)
    private double weightInKG;
    // - Add a private boolean field called isPerishable
    private boolean isPerishable;
    // - Constructor takes all fields and uses super for shared ones
    Grocery(String name, double price, double weightInKG, boolean isPerishable){
        super(name, price);
        this.weightInKG = weightInKG;
        this.isPerishable = isPerishable;
    }
    // - Override toString() to include weight and perishability
    @Override
    public String toString(){
        return "Name: " + this.name + "\nPrice: " + this.price + "\nProduct Id: " + super.getProductId() + "\nWeight (kg): " + this.weightInKG + "\nPerishibile?: " + this.isPerishable + "\n";
    }
}

// TODO: Define a final class Toy that extends Product
final class Toy extends Product{
    // - Add a private int field called minAge
    private int minAge;
    // - Constructor takes all fields and uses super for shared ones
    Toy(String name, double price, int minAge){
        super(name, price);
        this.minAge = minAge;
    }
    // - Override toString() to include minAge
    @Override
    public String toString(){
        return "Name: " + this.name + "\nPrice: " + this.price + "\nProduct Id: " + super.getProductId() + "\nMinimum Age: " + this.minAge + "\n";
    }
}


// TODO: Define class SuperStoreTest with a main method
class SuperStore{
    public static void main(String[] args) {
        // - Create at least one instance of each subclass ---- DOWN THERE vvvvvvvvvvvvvv
        // - Store them in a Product[] array
        Product[] products = new Product[]{new Electronics("WAOW iFOAN", 700000.30, "Abram's Electronics", true), new Grocery("Rotisserie Human (Abram)", 4.99, 300, false), new Toy("Car bomb", 12.67, 4)};
        // - Loop through and print each item
        for (Product product : products){
            System.out.println(product);
        }
        // - Call equals() to compare two products with the same ID and name
        Product bleach = new Toy("Bleach", 15.87, 15);
        Product bleach2 = new Toy("Bleach", 15.87, 15);
        System.out.println("Equals test??????? -> " + bleach2.equals(bleach));

        System.out.println("APPLYING DISCOUNT TO BLEACH!!! YAYAYAYAYAYYYV AYYAYAYYYAYYAAYY!!!!!!!!!!!!");
        System.out.println("Old price -- " + bleach.price);

        bleach.price *= Coupon.discountRate;
        System.out.printf("NEW PRICE -- %.2f\n", bleach.price);


    }
}


// Additional TODOs:

// 1. Try to extend Toy — what happens and why?  //NOTHIGN HAPPENDS EXCEPT MY CODE BREAKING BECAUSE I KEEP FORGETTING TO COMMENT IT OUT FOR THE LOVE OF GOD
//class LEGO extends Toy{ // When you try to extend toy you get an error because it is FINAL meaning you cant EXTEND IT..

//}


// 2. Make a class Coupon with a final discountRate and apply it to a Product
class Coupon{
    final static double discountRate = .45;
}

// 3. Add a method to Electronics called warrantyInfo() and mark it final
//OKIE

// 4. Use access modifiers appropriately and explain your choices in comments
