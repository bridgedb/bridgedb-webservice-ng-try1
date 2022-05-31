package org.bridgedb.server;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import org.bridgedb.DataSource;
import org.bridgedb.IDMapperStack;
import org.bridgedb.bio.Organism;
import org.bridgedb.rdb.GdbProvider;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

public class IDMapperResource extends ServerResource {

    @Override
    protected void doInit() throws ResourceException {
        System.out.println("Initting IDMapperResource");
    }

}
