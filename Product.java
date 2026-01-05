abstract class Product {
    private int productId;
    private String name;
    protected double price;

    abstract double calculateDiscount();

    public double getPrice() { return price; }
}

interface Taxable {
    double calculateTax();
}

class Electronics extends Product implements Taxable {
    public double calculateDiscount() { return price * 0.1; }
    public double calculateTax() { return price * 0.18; }
}

class Clothing extends Product {
    public double calculateDiscount() { return price * 0.2; }
}

class Groceries extends Product {
    public double calculateDiscount() { return price * 0.05; }
}
class Furniture extends Product implements Taxable {
    public double calculateDiscount() { return price * 0.15; }
    public double calculateTax() { return price * 0.12; }
}