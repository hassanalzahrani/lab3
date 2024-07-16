import java.util.List;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();


        User user1 = new User("hassan", "hassan@gmail.com");
        User user2 = new User("fahad", "fahad@gmail.com");


        store.addUser(user1);
        store.addUser(user2);

        store.displayUsers();


        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 10.99, 5);
        Movie movie1 = new Movie("Inception", "Christopher Nolan", "987654321", 14.99, 148);
        Music music1 = new Music("Thriller", "Michael Jackson", "111213141", 9.99, "Michael Jackson");
        AcademicBook academicBook1 = new AcademicBook("Introduction to Algorithms", "Thomas H. Cormen", "141516144", 79, 2, "Computer Science");


        store.addMedia(book1);
        store.addMedia(movie1);
        store.addMedia(music1);
        store.addMedia(academicBook1);


        store.displayMedias();


        Review review1 = new Review("hassan", 5, "good book!");
        Review review2 = new Review("fahad", 4.5, "good read!");

        book1.addReview(review1);
        book1.addReview(review2);


        System.out.println("Average Rating of \"" + book1.getTitle() + "\": " + book1.getAverageRating());


        user1.addToCart(book1);
        user1.addToCart(movie1);
        user1.addToCart(music1);
        user1.addToCart(academicBook1);
        user1.checkout();


        System.out.println("Remaining stock of \"" + book1.getTitle() + "\": " + book1.getQuantityInStock());


        book1.restock(10);


        System.out.println("Updated stock of \"" + book1.getTitle() + "\": " + book1.getQuantityInStock());


        List<Movie> similarMovies = movie1.recommendSimilarMovies(List.of(movie1));
        System.out.println("Similar movies to \"" + movie1.getTitle() + "\":");
        for (Movie movie : similarMovies) {
            System.out.println(movie);
        }


        List<Music> playlist = music1.generatePlaylist(List.of(music1));
        System.out.println("Playlist for artist \"" + music1.getAuteur() + "\":");
        for (Music music : playlist) {
            System.out.println(music);
        }
    }
}