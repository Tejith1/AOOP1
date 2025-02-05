package auction;

public class ReserveAuction extends Auction {
    @Override
    protected void announceStart() {
        System.out.println("Starting a reserve auction. Reserve price must be met to sell!");
    }

    @Override
    protected void acceptBids() {
        System.out.println("Accepting bids for the reserve auction.");
    }

    @Override
    protected void announceEnd() {
        System.out.println("The reserve auction has ended. The item is sold if reserve price is met.");
    }
}
