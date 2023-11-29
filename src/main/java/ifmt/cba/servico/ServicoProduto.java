package ifmt.cba.servico;

import java.util.ArrayList;
import ifmt.cba.vo.produto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ServicoProduto {
   @WebMethod
   public void inserirProduto(produto produto) throws Exception;

   public void excluirGrupoAlimentar(produto produto) throws Exception;

   public void buscarProdutoPorId(int id);

   public ArrayList<produto> listarProduto();
}
