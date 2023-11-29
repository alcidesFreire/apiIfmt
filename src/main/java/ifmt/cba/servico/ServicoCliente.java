package ifmt.cba.servico;

import java.util.ArrayList;
import ifmt.cba.vo.cliente;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ServicoCliente {
    @WebMethod
    public void adicionaCliente(cliente cliente) throws Exception;

    public void excluirCliente(cliente cliente) throws Exception;

    public void atualizaCliente(cliente cliente);

    public ArrayList<cliente> listarCliente();

}
