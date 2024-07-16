
 public class Review {
    private String username;
    private double rating;
    private String comments;

    public Review(String username, double rating, String comments) {
        this.username = username;
        this.rating = rating;
        this.comments = comments;
    }

    public double getRating() {
        return rating;
    }
}