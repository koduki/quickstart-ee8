package apps;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @authorkoduki
 */
@Path("rest")
public class HelloResource {

    @GET
    public Response ping() {
        return Response
                .ok("ping")
                .build();
    }
}
