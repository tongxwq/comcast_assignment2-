package org.comcast.assignment.ad.service;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.comcast.assignment.ad.collections.AdCollection;
import org.comcast.assignment.ad.exception.DataDuplicationException;
import org.comcast.assignment.ad.exception.DataExpiredException;
import org.comcast.assignment.ad.exception.DataNotFoundException;
import org.comcast.assignment.ad.model.Advertisement;

public class AdService {
 private Map<String, Advertisement> adsMap = AdCollection.getAds();
 public List <Advertisement> getAllAds() {
	return new ArrayList<Advertisement>(adsMap.values());
}
 
 
 public AdService() {
	adsMap.put("Nike", new Advertisement("Nike",100,"just do it","2017/01/02 11:22:33"));
	adsMap.put("Adidas", new Advertisement( "Adidas", 300000000,"Nothing is impossible","2017/01/01 12:23:34"));
}


public Advertisement addAd(Advertisement ad){
	String partnerName=ad.getPartnerId();
	
	for(String key: adsMap.keySet()){
		if(key.equals(partnerName)){
			throw new DataDuplicationException(partnerName);
		}
	}
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date currentDate = Calendar.getInstance().getTime();
	String aString =dateFormat.format(currentDate);
	ad.setCreateDate(aString);
	adsMap.put(ad.getPartnerId(), ad);
	 return ad;
 }
 public Advertisement getAd(String PartnerId){
	 Advertisement advertisement= adsMap.get(PartnerId);
	 if(advertisement==null){
		 throw new DataNotFoundException(PartnerId+" does not exist in the server");
	 }
	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	 Date currentDate =Calendar.getInstance().getTime();
	 
	 String storedDateString= advertisement.getCreateDate();
	 Date storedDate=Calendar.getInstance().getTime();
		try {
			storedDate = dateFormat.parse(storedDateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	long diff = currentDate.getTime()-storedDate.getTime();
	if((diff/1000)>advertisement.getDuration()){
		throw new DataExpiredException(advertisement.getPartnerId());
	}
	 return advertisement;
 }
 public void methodforchange1(){
	 
 }
 
}
