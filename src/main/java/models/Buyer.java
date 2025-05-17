package models;
public class Buyer extends User {

    public Buyer(String username, String email) {
        super(username, email);
    }

    @Override
    public void displayUserType() {
        System.out.println("User Type: Buyer");
    }
}