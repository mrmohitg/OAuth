package com.bharaththippireddy.trainings.jaxrs;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
@Produces({ "application/xml", "application/json" })
public interface PatientService {

	@GET
	@Path("/patients/{id}/")
	public abstract Patient getPatient(@PathParam("id") String id);

	@PUT
	@Path("/patients/")
	public abstract Response updatePatient(Patient patient);

	@POST
	@Path("/patients/")
	public abstract Response addPatient(Patient patient);

	@DELETE
	@Path("/patients/{id}/")
	public abstract Response deletePatients(@PathParam("id") String id);

	@Path("/prescriptions/{id}/")
	public abstract Prescription getPrescription(@PathParam("id") String prescriptionId);

}