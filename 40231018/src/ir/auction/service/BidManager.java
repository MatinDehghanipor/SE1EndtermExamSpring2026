package ir.auction.service;

import ir.auction.model.Bid;
import ir.auction.model.User;

import java.util.List;

public class BidManager {

    public boolean submitBid(Bid bid) {
        return false;
    }

    public Bid getHighestBid(int auctionId) {
        return null;
    }

    public List<Bid> getBidHistory(int auctionId) {
        return null;
    }

    public boolean validateBid(Bid bid) {
        return false;
    }

    public User determineWinner(int auctionId) {
        return null;
    }

}