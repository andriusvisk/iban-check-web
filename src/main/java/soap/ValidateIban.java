package soap;

import iban.IbanCheck;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * Created by andrius on 23/03/2017.
 */

@WebService
public class ValidateIban {

    public void ValidateIban() {}

    @WebMethod
    public String validate(String ibanStr) {

        return new IbanCheck().validateIban(ibanStr).build().toString();

    }

    @WebMethod
    public String validateList(final List<String> list) {

        return new IbanCheck().validateList(list);

    }
}
