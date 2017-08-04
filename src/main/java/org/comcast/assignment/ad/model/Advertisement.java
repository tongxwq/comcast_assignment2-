package org.comcast.assignment.ad.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Advertisement {
	

	private String partnerId;
	private int duration;
	private String adContent;
	 private String createDate;
	 

	 public String getCreateDate() {
	 	return createDate;
	 }
	 public void setCreateDate(String createDate) {
	 	this.createDate = createDate;
	 }
	

	public Advertisement() {
		
	}
	public Advertisement( String partnerId, int duration, String adContent,String createDate) {
	
		this.partnerId = partnerId;
		this.duration = duration;
		this.adContent = adContent;
		this.createDate = createDate;

	}

	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getAdContent() {
		return adContent;
	}
	public void setAdContent(String adContent) {
		this.adContent = adContent;
	}
	
	
}
