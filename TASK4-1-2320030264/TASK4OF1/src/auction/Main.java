package auction;

public class Main {
    public static void main(String[] args) {
        // Observer Pattern Setup
        Auctioneer auctioneer = new Auctioneer();

        Bidder bidder1 = new AuctionEvent("Bidder 1");
        Bidder bidder2 = new AuctionEvent("Bidder 2");

        auctioneer.subscribe(bidder1);
        auctioneer.subscribe(bidder2);

        auctioneer.notifyBidders("An auction for a vintage car is starting soon!");

        // Template Pattern Setup
        Auction standardAuction = new StandardAuction();
        Auction reserveAuction = new ReserveAuction();

        System.out.println("\n--- Conducting Standard Auction ---");
        standardAuction.conductAuction();

        System.out.println("\n--- Conducting Reserve Auction ---");
        reserveAuction.conductAuction();

        // Notify Bidders about auction end
        auctioneer.notifyBidders("The auction has ended. Thank you for participating!");

        // Unsubscribe a bidder
        auctioneer.unsubscribe(bidder1);
        auctioneer.notifyBidders("Bidder 1 has unsubscribed.");
    }
}
