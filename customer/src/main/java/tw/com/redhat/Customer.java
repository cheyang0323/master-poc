package tw.com.redhat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class Customer {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Customers!";
    }
}