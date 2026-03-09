import java.lang.*;
import java.util.*;

public class Product { //fara ai
    private int ProductId;
    private int SellerId;
    private String name;
    private String description;
    private double rating;
    private int reviews;
    private List<Review> ReviewList=new ArrayList<Review>();

    public Product(int ID, Seller entity, String name, String desc)
    {
    this.SellerId=entity.id;
    this.ProductId=ID;
    this.name=name;
    this.description=desc;
    this.rating=0;
    }

    public void addReview(Review rev) {
        this.ReviewList.add(rev);

        double totalScore = (this.rating * this.reviews) + rev.getRating();
        this.reviews++;
        this.rating = totalScore / this.reviews;
    }

    public int getId() {
        return this.ProductId;
    }

    public void display()
    {
        IO.println("--- Afisare Produs ---");
        IO.println("Id: "+this.ProductId);
        IO.println("Id seller: "+this.SellerId);
        IO.println("Nume: "+this.name);
        IO.println("Descriere: "+this.description);
        IO.println("Rating: "+this.rating);
    }

    public void displayReviews() {
        IO.println("--- Recenzii pentru produsul: " + this.name + " ---");

        for (Review rev : this.ReviewList) {
            rev.display();
            IO.println("----------------------------");
        }
        IO.println("Media ratingului: " + this.rating + " (din " + this.reviews + " recenzii)");
    }
}
