package ifmt.cba.servico;

import java.util.ArrayList;
import ifmt.cba.vo.preparoProduto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ServicoPreparoProduto {
    @WebMethod
    public void inserirPreparoProduto(preparoProduto preparoProduto) throws Exception;

    public void excluirPreparoProduto(preparoProduto preparoProduto) throws Exception;

    public void buscarPreparoProduto(int id);

    public ArrayList<preparoProduto> listarPreparoProduto();
}
