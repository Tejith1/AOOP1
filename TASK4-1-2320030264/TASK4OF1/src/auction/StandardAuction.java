package auction;

public class StandardAuction extends Auction {
    @Override
    protected void announceStart() {
        System.out.println("Starting a standard auction. Bidders can place their bids!");
    }

    @Override
    protected void acceptBids() {
        System.out.println("Accepting bids for the standard auction.");
    }

    @Override
    protected void announceEnd() {
        System.out.println("The standard auction has ended. The highest bidder wins!");
    }
}
