package auction;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer {
    private List<Bidder> bidders = new ArrayList<>();

    // Subscribe a bidder
    public void subscribe(Bidder bidder) {
        bidders.add(bidder);
    }

    // Unsubscribe a bidder
    public void unsubscribe(Bidder bidder) {
        bidders.remove(bidder);
    }

    // Notify all bidders
    public void notifyBidders(String message) {
        for (Bidder bidder : bidders) {
            bidder.update(message);
        }
    }
}
