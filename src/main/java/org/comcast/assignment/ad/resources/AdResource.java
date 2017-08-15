package org.comcast.assignment.ad.resources;



import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.comcast.assignment.ad.model.Advertisement;
import org.comcast.assignment.ad.service.AdService;

@Path("/")
public class AdResource {
	AdService adservice = new AdService();
     
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Advertisement> getAds(){
		return adservice.getAllAds();
	}
	public void newMethod(){
		
	}
	
	@GET
	@Path("/{adId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Advertisement getOneAd(@PathParam("adId") String adId){
		return adservice.getAd(adId);
		
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Advertisement addOneAd(Advertisement ad){
		return adservice.addAd(ad);
	}
	public void newMethod2(){
		
	}
	
	
}
