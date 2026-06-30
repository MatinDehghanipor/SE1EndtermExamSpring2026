package ir.auction.model;

import java.time.LocalDateTime;

public class Bid {

    private int id;
    private Auction auction;
    private User bidder;
    private double amount;
    private LocalDateTime bidTime;

    public Bid() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}