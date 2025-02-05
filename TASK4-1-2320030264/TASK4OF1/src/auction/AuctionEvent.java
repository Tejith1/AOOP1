package auction;

public class AuctionEvent implements Bidder {
    private String name;

    public AuctionEvent(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
