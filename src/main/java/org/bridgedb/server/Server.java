package org.bridgedb.server;

import org.restlet.Component;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class Server extends ServerResource {

    public static void main(String[] args) throws Exception {
        int port = 8082;

        Component component = new Component();
        component.getServers().add(Protocol.HTTP, port);
        component.getDefaultHost().attach(new IDMapperService());		
        component.start();
    }

}
