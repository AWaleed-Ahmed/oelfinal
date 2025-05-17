package models;
import java.util.ArrayList;
public class Product {
    private String name;
    private String description;
    private double price;
    private Seller seller;
    private boolean isSold;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Product(String name, String description, double price, Seller seller) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.seller = seller;
        this.isSold = false;
    }
    public void addReview(Review r) {
        reviews.add(r);
    }
    private ArrayList<Bid> bids = new ArrayList<>();
    private Bid acceptedBid = null; // When seller accepts a bid
    public void placeBid(Bid b) {
        if (!isSold) {
            bids.add(b);
            System.out.println("Bid placed: " + b);
        } else {
            System.out.println("Product already sold.");
        }
    }

    public void viewBids() {
        if (bids.isEmpty()) {
            System.out.println("No bids yet.");
        } else {
            System.out.println("Bids for " + name + ":");
            for (int i = 0; i < bids.size(); i++) {
                System.out.println((i + 1) + ". " + bids.get(i));
            }
        }
    }

    public void acceptBid(int index) {
        if (index >= 0 && index < bids.size()) {
            acceptedBid = bids.get(index);
            isSold = true;
            System.out.println("Bid accepted: " + acceptedBid);
        } else {
            System.out.println("Invalid bid index.");
        }
    }

    public void showReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet.");
        } else {
            System.out.println("Reviews for " + name + ":");
            for (Review r : reviews) {
                System.out.println(r);
            }
        }
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public Seller getSeller() { return seller; }
    public boolean isSold() { return isSold; }

    public void setSold(boolean sold) { this.isSold = sold; }

    @Override
    public String toString() {
        return name + " | " + description + " | $" + price + " | Seller: " + seller.getUsername();
    }
}