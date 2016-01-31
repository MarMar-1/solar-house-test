import org.eclipse.jetty.server.Server;

/**
 * Created by Marius Mueller on 1/31/2016.
 */
public class TestServer {

    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
        server.setHandler(new HelloHandler());

        server.start();
        server.join();
    }
}
