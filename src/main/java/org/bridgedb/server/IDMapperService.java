package org.bridgedb.server;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;
import org.restlet.routing.Template;
import org.restlet.routing.TemplateRoute;

import org.bridgedb.bio.DataSourceTxt;
import org.bridgedb.rdb.GdbProvider;

public class IDMapperService extends Application {

    public IDMapperService() {
    }

    private GdbProvider gdbProvider;

    public synchronized void start() throws Exception {
        super.start();
        DataSourceTxt.init();
        System.out.println("Initialized the data sources");
        connectGdbs();
        System.out.println("Loaded the databases");
    }

    @Override
    public Restlet createInboundRoot() {
        System.out.println("Creating the root");
        Router router = new Router(getContext());

        TemplateRoute route = router.attach("/{organism}/properties", Properties.class);
        route.getTemplate().setMatchingMode(Template.MODE_STARTS_WITH);

        System.out.println("Returning the root");
        return router;
    }

    private void connectGdbs() throws Exception  {
    }

}
