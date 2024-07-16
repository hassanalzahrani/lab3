

import java.util.ArrayList;
import java.util.List;

public class User {
    public String username;
    public String email;
    private List<Media> purchasedMedia;
    private List<Media> shoppingCart;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedMedia = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public void addToCart(Media media) {
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
    }

    public void checkout() {
        for (Media media : shoppingCart) {
            if (media instanceof Book) {
                ((Book) media).purchase(this);
            } else if (media instanceof Movie) {
                ((Movie) media).watch(this);
            } else if (media instanceof Music) {
                ((Music) media).listen(this);
            }
        }
        shoppingCart.clear();
    }

    public void addPurchasedMedia(Media media) {
        purchasedMedia.add(media);
    }
}