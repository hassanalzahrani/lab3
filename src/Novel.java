

 public class Novel extends Book {
     private String genre;

     public Novel(String title, String auteur, String ISBN, double price, int quantityInStock, String genre) {
         super(title, auteur, ISBN, price, quantityInStock);
         this.genre = genre;
     }

     @Override
     public String getMediaType() {
         if (isBestseller()) {
             return "Bestselling Novel";
         } else {
             return "Novel";
         }
     }
 }
