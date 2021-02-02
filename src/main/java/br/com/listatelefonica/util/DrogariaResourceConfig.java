package br.com.listatelefonica.util;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

//http://localhost:8080/listatelefonica/nomedorest

@ApplicationPath("rest")
public class DrogariaResourceConfig extends ResourceConfig{

	public DrogariaResourceConfig() {
		packages("br.com.listatelefonica.service");
	}
	
}
