package com.metro.test.v1;


public class SmartCard {
	private String cardId;
    private  double cardBalance;
    private final int MIN_BALANCE = 50;
    private String startStation;
    private String endStation;
    private String dayType;

    public SmartCard(String cardId, String startStation,String endStation, String day, double initialBalance) {
        this.cardId = cardId;
        this.startStation = startStation;
        this.endStation=endStation;
        this.dayType = day;
        if(initialBalance==0) {
        	this.cardBalance=MIN_BALANCE;
        }
        else {
        	this.cardBalance=initialBalance;
        }
    }

    public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getStartStation() {
        return startStation;
    }

    public String getDay() {
        return dayType;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }


    public double getCardbalance() {
        return cardBalance;
    }
// calculate card balance for drop station based on station crossed and day type.
    public double cardBalance(int stationCount, String day) throws Exception {

        try {
            double fare = (FareDetails.fareMap.get(day) * stationCount);
            cardBalance = (int) (cardBalance - fare);
            if (cardBalance < MIN_BALANCE) {
                throw new Exception("Not Enough balance. ");

            }
        } catch (Exception e) {
        	System.out.println("Exception occured while processing  card balance details.");
            throw e;
        }

return cardBalance;
    }
}
