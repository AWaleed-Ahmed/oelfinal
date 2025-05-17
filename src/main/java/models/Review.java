package models;
public class Review {
    private String reviewerName;
    private int rating; // from 1 to 5
    private String comment;

    public Review(String reviewerName, int rating, String comment) {
        this.reviewerName = reviewerName;
        this.rating = rating;
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        return reviewerName + " rated " + rating + "/5 - " + comment;
    }
}