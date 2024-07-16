import java.util.ArrayList;
import java.util.List;


public class Book extends Media {
    private int quantityInStock;
    private List<Review> reviews;

    public Book(String title, String auteur, String ISBN, double price, int quantityInStock) {
        super(title, auteur, ISBN, price);
        this.quantityInStock = quantityInStock;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) {
            return 0;
        }
        double totalRating = 0;
        for (Review review : reviews) {
            totalRating += review.getRating();
        }
        return totalRating / reviews.size();
    }

    public void purchase(User user) {
        if (quantityInStock > 0) {
            user.addPurchasedMedia(this);
            quantityInStock--;
        } else {
            System.out.println("Sorry, the book is out of stock.");
        }
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        quantityInStock += quantity;
        System.out.println("The book has been restocked. New quantity: " + quantityInStock);
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    @Override
    public String getMediaType() {
        if (isBestseller()) {
            return "Bestselling Book";
        } else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Quantity in Stock: " + quantityInStock + ", Average Rating: " + getAverageRating();
    }
}