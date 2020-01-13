package com.metro.test.v1;

import java.util.HashMap;
import java.util.Map;
//Fare details for day type will be handled here.
public class FareDetails {
	 public static Map<String, Double> fareMap = new HashMap<>();
	    static {
	        fareMap.put("weekday", 7.0);
	        fareMap.put("weekend", 5.5);
	    }
}
