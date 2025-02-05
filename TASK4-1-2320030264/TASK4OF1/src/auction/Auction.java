package auction;

public abstract class Auction {
    public final void conductAuction() {
        announceStart();
        acceptBids();
        announceEnd();
    }

    protected abstract void announceStart();
    protected abstract void acceptBids();
    protected abstract void announceEnd();
}
