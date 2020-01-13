package com.metro.test.v1;


/*
 * This class will handle card swipe in at particular station.
 */
public class CardSwipeIn implements CardSwipeFactory {

    private SmartCard smartCard;

    public CardSwipeIn(SmartCard smartCard) {
        this.smartCard = smartCard;
    }

    @Override
    public void processCard() throws MetroCardProcessException {

        try {
        	System.out.println("-----------------------CARD SWIPE IN DETAILS---------------------");
           System.out.println("Card ID :"+smartCard.getCardId());
           System.out.println("Swipe In station :"+smartCard.getStartStation());
           System.out.println("Travel day type :"+smartCard.getDay());
           System.out.println("Current Balance :"+smartCard.getCardbalance());
            System.out.println("-----------------------------------------------------------------------------------------");
        } catch (Exception e) {
        	e.printStackTrace();
            System.out.println("Exception occured while processing card at swipeIn :"+e.getMessage());
            throw new MetroCardProcessException("Exception occured while processing card at swipeIn ");

        }
    }

}
