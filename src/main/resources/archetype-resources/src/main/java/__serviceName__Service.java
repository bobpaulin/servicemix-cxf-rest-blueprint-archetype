package ${package};

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.DefaultValue; 


@Path("/")
public class ${serviceName}Service {
    @GET
    @Produces("application/json")
    public Response get() throws Exception
    {
        Map<String, Object> testMap = new HashMap<String, Object>();
        testMap.put("message", "Hello World");
        return Response.ok().entity(testMap).build();
    }
}
