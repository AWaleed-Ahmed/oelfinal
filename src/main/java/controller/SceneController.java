package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    private static Stage stage;

    public static void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

    private void switchScene(String fxmlFile, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/" + fxmlFile));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/view/styles.css").toExternalForm());

            if (stage == null) {
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            }

            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Scene Navigation
    public void goToWelcome(ActionEvent event) {
        switchScene("welcome.fxml", event);
    }

    public void goToLogin(ActionEvent event) {
        switchScene("login.fxml", event);
    }

    public void goToSignup(ActionEvent event) {
        switchScene("signup.fxml", event);
    }

    public void goToMarketplace(ActionEvent event) {
        switchScene("marketplace.fxml", event);
    }

    public void goToProductDetails(ActionEvent event) {
        switchScene("product_detail.fxml", event);
    }

    public void goToBidPage(ActionEvent event) {
        switchScene("bid.fxml", event);
    }

    public void goToReviewPage(ActionEvent event) {
        switchScene("reviews.fxml", event);
    }

    public void goToSellerDashboard(ActionEvent event) {
        switchScene("seller_dashboard.fxml", event);
    }

    public void goToAddProduct(ActionEvent event) {
        switchScene("add_product.fxml", event);
    }

    public void goToConfirmation(ActionEvent event) {
        switchScene("confirmation.fxml", event);
    }

    public void exitApp(ActionEvent event) {
        if (stage == null && event != null) {
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        }
        if (stage != null) {
            stage.close();
        }
    }

    // Logic Handlers
    public void registerBuyer(ActionEvent event) {
        System.out.println("Registering buyer...");
        goToMarketplace(event);
    }

    public void registerSeller(ActionEvent event) {
        System.out.println("Registering seller...");
        goToSellerDashboard(event);
    }

    public void onBuyerClick(ActionEvent event) {
        goToMarketplace(event);
    }

    public void onSellerClick(ActionEvent event) {
        goToSellerDashboard(event);
    }

    public void addProduct(ActionEvent event) {
        System.out.println("Product added.");
        goToSellerDashboard(event);
    }

    public void viewDetails(ActionEvent event) {
        goToProductDetails(event);
    }

    public void buyProduct(ActionEvent event) {
        System.out.println("Buying product...");
        goToConfirmation(event);
    }

    public void placeBid(ActionEvent event) {
        System.out.println("Placing bid...");
        goToBidPage(event);
    }

    public void submitReview(ActionEvent event) {
        System.out.println("Review submitted.");
        goToReviewPage(event);
    }

    public void viewBids(ActionEvent event) {
        System.out.println("Viewing bids...");
    }

    public void acceptBid(ActionEvent event) {
        System.out.println("Bid accepted.");
        goToConfirmation(event);
    }
}
