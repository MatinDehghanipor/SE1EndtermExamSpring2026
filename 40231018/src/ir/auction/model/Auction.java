package ir.auction.model;

import java.time.LocalDateTime;

public class Auction {

    private int id;
    private Item item;
    private User seller;
    private double startingPrice;
    private double currentPrice;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Auction() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}