public class Seller extends User { //ai

    public Seller(int id, String name) {
        super(id, name);
    }

    public void addProduct() {
        System.out.println(name + " a adaugat un produs.");
    }

    @Override
    public void display() {
        System.out.println("Seller: " + name + " (ID: " + id + ")");
    }
}