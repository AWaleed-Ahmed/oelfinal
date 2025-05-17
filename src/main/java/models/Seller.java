package models;
import java.util.ArrayList;

public class Seller {
    private String username;
    private String email;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Seller(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void addReview(Review r) {
        reviews.add(r);
    }

    public void showReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews for seller yet.");
        } else {
            System.out.println("Reviews for seller " + username + ":");
            for (Review r : reviews) {
                System.out.println(r);
            }
        }
    }
}