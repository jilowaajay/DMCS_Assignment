package com.metro.test.v1;

public class Station {
	CardSwipeFactory swipeType;

    public void setCommand(CardSwipeFactory swipeType) {
        this.swipeType = swipeType;
    }

    public void SwipeCard() throws Exception {
        try {
        	swipeType.processCard();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception while processing card.");
            throw e;
        }
    }
}
