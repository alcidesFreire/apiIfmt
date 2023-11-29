package ifmt.cba.servico;

import java.util.ArrayList;
import ifmt.cba.vo.cardapio;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ServicoCardapio {
   @WebMethod
   public void inserirCardapio(cardapio cardapio) throws Exception;

   public void excluirCardapio(cardapio cardapio) throws Exception;

   public void buscarCardapioPorId(int id);

   public ArrayList<cardapio> listarCardapio();
}
