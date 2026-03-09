public class Buyer extends User { //ai

    public Buyer(int id, String name) {
        super(id, name);
    }

    public void leaveReview() {
        System.out.println(name + " a lasat un review.");
    }

    @Override
    public void display() {
        System.out.println("Buyer: " + name + " (ID: " + id + ")");
    }
}