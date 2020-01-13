package com.metro.test.v1;

import java.util.LinkedList;
import java.util.List;

/*
 * This is the main class from which the application execution will start.
 * 
 */
public class CardSystemTest {
	public static void main(String[] args) throws MetroCardProcessException {
		
		try{
			// sample smart card list
          List<SmartCard> allCardList=new LinkedList<>();
          allCardList.add(new SmartCard("1", "A1","A3", "weekend",80.0));
          allCardList.add(new SmartCard("2", "A3", "A5","weekday",140.5));
          allCardList.add(new SmartCard("3", "A5","A7", "weekday", 100.0));
          allCardList.add(new SmartCard("4", "A2","A4", "weekend", 500.0));
          allCardList.add(new SmartCard("5", "A8","A10", "weekday",70.0 ));
          allCardList.add(new SmartCard("6", "A6","A8", "weekday",60.0 ));

          CardSwipeIn swipeIn=null;
          CardSwipeOut swipeOut=null;
          
          //process all cards, default station count for traveling is taken as 2 stations
        for(SmartCard card : allCardList) {
         swipeIn = new CardSwipeIn(card);
         swipeOut = new CardSwipeOut(card,2);
         Station stationObj = new Station();
         stationObj.setCommand(swipeIn);

         stationObj.SwipeCard();
         
         stationObj.setCommand(swipeOut);
         stationObj.SwipeCard();
        }
        
       
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception occured while processing card details.");
			throw new MetroCardProcessException("Exception occured while processing card details.");
		}


    }
}
