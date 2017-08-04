package org.comcast.assignment.ad.exception;

public class DataExpiredException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8227375925009344135L;
	public DataExpiredException(String message){
		super(message);
	}
}
