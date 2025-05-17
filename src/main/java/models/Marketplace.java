package models;
public class Marketplace {
    Product[] products = new Product[1000];  // Max 100 products
    int count = 0;

    // Add a product to the marketplace
    public void addProduct(Product p) {
        if (count < products.length) {
            products[count] = p;
            count++;
            System.out.println("Product added: " + p.getName());
        } else {
            System.out.println("Marketplace is full!");
        }
    }

    // Buy a product (based on product index)
    public void buyProduct(int index) {
        if (index >= 0 && index < count && !products[index].isSold()) {
            products[index].setSold(true);
            System.out.println("Product bought: " + products[index].getName());
        } else {
            System.out.println("Invalid product or already sold.");
        }
    }

    // Show available products
    public void showProducts() {
        System.out.println("\n--- Products in Marketplace ---");
        for (int i = 0; i < count; i++) {
            if (!products[i].isSold()) {
                System.out.println((i + 1) + ". " + products[i]);
            }
        }
    }
}