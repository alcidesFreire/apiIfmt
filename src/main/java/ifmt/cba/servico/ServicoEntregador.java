package ifmt.cba.servico;

import java.util.ArrayList;
import ifmt.cba.vo.entregador;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ServicoEntregador {
    @WebMethod
    public void inserirEntregador(entregador entregador) throws Exception;

    public void excluirEntregador(entregador entregador) throws Exception;

    public void buscarEntregadorPorId(int id);

    public ArrayList<entregador> listaEntregador();

}
