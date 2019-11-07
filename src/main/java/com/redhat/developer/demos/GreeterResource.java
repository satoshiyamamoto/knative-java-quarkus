package com.redhat.developer.demos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/")
public class GreeterResource {
    @ConfigProperty(name = "TARGET", defaultValue = "World")
    String target;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greet() {
        return "Hello " + target + "!" ;
    }
}