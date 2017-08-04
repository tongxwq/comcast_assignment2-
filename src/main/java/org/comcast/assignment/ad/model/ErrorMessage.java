package org.comcast.assignment.ad.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class ErrorMessage {
 private String errorMessage;
 private int code;
 private String description;

public ErrorMessage() {

}
public ErrorMessage(String errorMessage, int code, String description) {
	
	this.errorMessage = errorMessage;
	this.code = code;
	this.description = description;
	
}
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
 
}
