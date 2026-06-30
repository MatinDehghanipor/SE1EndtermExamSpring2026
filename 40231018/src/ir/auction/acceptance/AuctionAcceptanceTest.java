package ir.auction.acceptance;

import ir.auction.model.Auction;
import ir.auction.service.AuctionManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AuctionAcceptanceTest {

    @Test
    void sellerCanCreateAuctionSuccessfully() {

        AuctionManager manager = new AuctionManager();

        Auction auction = new Auction();

        assertDoesNotThrow(() -> {

            manager.createAuction(auction);

            manager.startAuction(1);

        });

    }

}