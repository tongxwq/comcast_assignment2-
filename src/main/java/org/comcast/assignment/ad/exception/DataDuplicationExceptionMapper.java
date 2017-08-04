package org.comcast.assignment.ad.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.comcast.assignment.ad.model.ErrorMessage;
@Provider
public class DataDuplicationExceptionMapper implements ExceptionMapper<DataDuplicationException> {

	@Override
	public Response toResponse(DataDuplicationException ex) {
		ErrorMessage  errorMessage1 = new ErrorMessage(ex.getMessage(), 480, "Item exsits in system");
		
		return Response.status(Status.BAD_REQUEST)
				.entity(errorMessage1)
				.build();
	}

}
