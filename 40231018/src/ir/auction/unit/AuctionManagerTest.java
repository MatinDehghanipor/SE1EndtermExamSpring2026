package ir.auction.unit;

import ir.auction.service.AuctionManager;
import ir.auction.model.Auction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuctionManagerTest {

    private AuctionManager auctionManager;

    @BeforeEach
    void setUp() {
        auctionManager = new AuctionManager();
    }

    @Test
    void createAuctionShouldNotThrowException() {

        Auction auction = new Auction();

        assertDoesNotThrow(() ->
                auctionManager.createAuction(auction)
        );
    }

    @Test
    void updateAuctionShouldNotThrowException() {

        Auction auction = new Auction();

        assertDoesNotThrow(() ->
                auctionManager.updateAuction(auction)
        );
    }

    @Test
    void deleteAuctionShouldNotThrowException() {

        assertDoesNotThrow(() ->
                auctionManager.deleteAuction(1)
        );
    }

    @Test
    void getAuctionShouldReturnNullWhenNotImplemented() {

        assertNull(
                auctionManager.getAuction(1)
        );
    }

    @Test
    void getAllAuctionsShouldReturnNullWhenNotImplemented() {

        assertNull(
                auctionManager.getAllAuctions()
        );
    }

}