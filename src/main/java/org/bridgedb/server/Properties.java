package org.bridgedb.server;

import org.bridgedb.IDMapper;
import org.bridgedb.IDMapperStack;
import org.restlet.data.Status;
import org.restlet.resource.Get;

public class Properties extends IDMapperResource {

    @Get
    public String getPropertiesResult()  {
        return "Properties for " + (String) getRequest().getAttributes().get("organism");
    }
}
