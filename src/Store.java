
import java.util.ArrayList;
import java.util.List;


public class Store {
    private List<Media> availableMedia;
    private List<User> registeredUsers;

    public Store() {
        this.availableMedia = new ArrayList<>();
        this.registeredUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        registeredUsers.add(user);
    }

    public void displayUsers() {
        System.out.println("Registered Users:");
        for (User user : registeredUsers) {
            System.out.println("Username: " + user.username + ", Email: " + user.email);
        }
    }

    public void addMedia(Media media) {
        availableMedia.add(media);
    }

    public void displayMedias() {
        System.out.println("Available Media:");
        for (Media media : availableMedia) {
            System.out.println(media);
        }
    }

    public Book searchBook(String title) {
        for (Media media : availableMedia) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media;
            }
        }
        return null;
    }
}