import java.lang.*;
public static void main() {
    Seller SM=new Seller(1,"SM");
    Seller DCA=new Seller(2,"DCA");
    Buyer DAM=new Buyer(3,"Denis");
    Buyer Alex=new Buyer(4,"Alexandru");
    Product flansa=new Product(1,SM, "Flansa", "O flanșă este o componentă mecanică esențială, utilizată în principal pentru îmbinarea a două conducte, robineți, pompe sau alte echipamente.");
    Product arc=new Product(1,SM, "Arc bilstein", "Arc bilstein axa spate coborare 5cm");

    Review hater=new Review(1,Alex, flansa,"Groaznic produsul","Nu sunt multumit de acest produs, promite specificatii pe care nu le are",1);
    flansa.addReview(hater);
    Review Dezamagit=new Review(2,DAM, arc,"Dezamagitor","Arcurile de coborare nu au functionat corespunzator",3);
    arc.addReview(Dezamagit);

    flansa.display();
    arc.display();
    flansa.displayReviews();
}
