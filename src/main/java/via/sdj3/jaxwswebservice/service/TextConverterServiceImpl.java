package via.sdj3.jaxwswebservice.service;

import javax.jws.WebService;

/**
 * @author JOOK
 * @version 1.0
 */
@WebService(endpointInterface = "via.sdj3.jaxwswebservice.service.TextConverterService", serviceName = "TextConverterService")
public class TextConverterServiceImpl implements TextConverterService {
    @Override
    public String toUpper(String text) {
        return text.toUpperCase();
    }

    @Override
    public String capitalizeFirstCharacter(String text) {
        return Character.toUpperCase(text.charAt(0)) + text.substring(1).toLowerCase();
    }
}
