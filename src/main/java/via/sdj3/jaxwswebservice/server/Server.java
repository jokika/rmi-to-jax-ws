package via.sdj3.jaxwswebservice.server;

import via.sdj3.jaxwswebservice.service.TextConverterServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * @author JOOK
 * @version 1.0
 */
public class Server {
    public static void main(String[] args) {
        TextConverterServiceImpl service = new TextConverterServiceImpl();
        String address = "http://localhost:9092/jaxws-text-converter-service";
        Endpoint.publish(address, service);

        System.out.println("********  The TextConverter Server is ready! ******");
        System.out.println("===================================================");
        try {
            Thread.sleep(5 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("******** Exiting the Server ...");
        System.exit(0);
    }
}
