public class Review { //fara ai
    private int id;
    private int BuyerId;
    private int ProductId;
    private String title;
    private String text;
    private double rating;

    public Review(int id, Buyer entity, Product Produs, String title, String text, double rating)
    {
    this.id=id;
    this.BuyerId= entity.getId();
    this.ProductId=Produs.getId();
    this.title=title;
    this.text=text;
    this.rating=rating;
    }

    public double getRating() {
        return rating;
    }


    public void display()
    {
        IO.println("--- Afisare review ---");
        IO.println("Id: "+this.id);
        IO.println("Buyer Id: "+this.BuyerId);
        IO.println("Product Id: "+this.ProductId);
        IO.println("Title: "+this.title);
        IO.println("Rating: "+this.rating);
        IO.println("Text: "+this.text);

    }
}
