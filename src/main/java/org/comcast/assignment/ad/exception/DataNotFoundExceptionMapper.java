package org.comcast.assignment.ad.exception;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.comcast.assignment.ad.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException ex) {
		
		ErrorMessage  errorMessage1 = new ErrorMessage(ex.getMessage(), 404, "we can not find your ad item");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage1)
				.build();
	}

}
