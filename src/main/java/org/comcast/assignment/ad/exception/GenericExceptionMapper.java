package org.comcast.assignment.ad.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.comcast.assignment.ad.model.ErrorMessage;



@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable ex) {
		
		ErrorMessage  errorMessage1 = new ErrorMessage(ex.getMessage(), 500, "Internal error");
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(errorMessage1)
				.build();
	}

}
