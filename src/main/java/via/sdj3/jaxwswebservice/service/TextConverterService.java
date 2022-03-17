package via.sdj3.jaxwswebservice.service;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author JOOK
 * @version 1.0
 */
@WebService
public interface TextConverterService {
    String toUpper(@WebParam(name="text") String text);
    String capitalizeFirstCharacter(@WebParam(name="text") String text);
}
