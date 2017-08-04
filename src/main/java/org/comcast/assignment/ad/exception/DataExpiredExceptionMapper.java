package org.comcast.assignment.ad.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.comcast.assignment.ad.model.ErrorMessage;
@Provider
public class DataExpiredExceptionMapper implements ExceptionMapper<DataExpiredException> {

	@Override
	public Response toResponse(DataExpiredException ex) {
		ErrorMessage  errorMessage1 = new ErrorMessage(ex.getMessage(), 490, "Item is expired");
	
		return Response.status(Status.BAD_REQUEST)
				.entity(errorMessage1)
				.build();
	}

}
