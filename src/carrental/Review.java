package carrental;


public class Review {
   private Integer rating;
   private String comment;

   public Review submit(String customerID, String contractID, Integer rating, String comment) {
       this.rating = rating;
       this.comment = comment;
       return this;
   }
}