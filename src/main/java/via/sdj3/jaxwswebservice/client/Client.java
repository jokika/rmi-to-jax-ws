package via.sdj3.jaxwswebservice.client;

import via.sdj3.jaxwswebservice.service.TextConverterService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author JOOK
 * @version 1.0
 */
public class Client {
    private static TextConverterService textConverterService;
    public static void main(String[] args) throws MalformedURLException {
        textConverterService = getServiceInterface();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to convert to uppercase: ");
        String line = input.nextLine();
        String convertedLine = convertString(line, true);
        System.out.println ("Uppercase version: " + convertedLine);

        System.out.print("Enter a string to capitalize first letter: ");
        line = input.nextLine();
        convertedLine = convertString(line, false);
        System.out.println("Capitalized version: " + convertedLine);
    }

    private static TextConverterService getServiceInterface() throws MalformedURLException {
        URL WSDL_URL = new URL("http://localhost:9092/jaxws-text-converter-service?wsdl");

        QName SERVICE_NAME = new QName("http://service.jaxwswebservice.sdj3.via/", "TextConverterService");
        // Create the CXF supplied service
        Service service = Service.create(WSDL_URL, SERVICE_NAME);
        System.out.println("JAX-WS SOAP Web Service now created ...");

        // Obtain the service interface by using the getPort method
        TextConverterService tcws = service.getPort(TextConverterService.class);
        return tcws;
    }

    public static String convertString(String text, boolean upper)
    {
        if (upper) {
            return textConverterService.toUpper(text);
        }
        return textConverterService.capitalizeFirstCharacter(text);
    }

}
