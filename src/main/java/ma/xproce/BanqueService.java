package ma.xproce;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    private List <Compte> comptes;
    public BanqueService() {
        this.comptes = new ArrayList<>();
    }
    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name="montant") double mt) {
        return mt * 2;
    }
    @WebMethod(operationName = "getcompte")
    public Compte getCompte(@WebParam(name="code")Integer cd) {
        // Find account by code
        for (Compte compte : comptes) {
            if (compte.getCode().equals(cd)) {
                return compte;
            }
        }
        return null;
    }
    @WebMethod(operationName = "listCompte")
    public List<Compte> listComptes() {
        return comptes;
    }
}
