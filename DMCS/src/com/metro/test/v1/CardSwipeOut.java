package com.metro.test.v1;

/*
 * This class will handle card swipe out at particular station.
 */
public class CardSwipeOut implements CardSwipeFactory {

    private SmartCard smartCard;
    private int noOfStations;

    public CardSwipeOut(SmartCard smartCard, int noOfStations) {
        this.smartCard = smartCard;
        this.noOfStations = noOfStations;
    }

    @Override
    public void processCard() throws MetroCardProcessException {
        try {   
        	System.out.println("------------------------------ Card Swipe Out Details---------------------------------");
        	System.out.println("Card id : "+smartCard.getCardId());
        	System.out.println("Initial balance : "+smartCard.getCardbalance());
        	System.out.println("boarded station : "+smartCard.getStartStation()+", drop station : "+smartCard.getEndStation());
        	System.out.println("day type : "+smartCard.getDay());
        	System.out.println("No of stations travelled : "+noOfStations);
        	System.out.println("Card balance left at drop station : "+smartCard.cardBalance(2, smartCard.getDay()));
        	System.out.println("--------------------------------------------------------------------------------------------");

        } catch (Exception exception) {
            System.out.println("Not enough balance. Please recharge your card before proceed. ");
            throw new MetroCardProcessException("Not enough balance. Please recharge your card before proceed. ");
        }

    }

}
