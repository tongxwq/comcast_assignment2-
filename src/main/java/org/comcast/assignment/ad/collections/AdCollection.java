package org.comcast.assignment.ad.collections;

import java.util.HashMap;
import java.util.Map;

import org.comcast.assignment.ad.model.Advertisement;

public class AdCollection {
	
	private static Map<String, Advertisement> ads= new HashMap<>();
	
	public static Map<String, Advertisement> getAds() {
		return ads;
	}
}
