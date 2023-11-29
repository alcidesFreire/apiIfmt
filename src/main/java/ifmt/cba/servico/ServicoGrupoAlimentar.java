package ifmt.cba.servico;

import java.util.ArrayList;
import ifmt.cba.vo.grupoAlimentar;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ServicoGrupoAlimentar {
   @WebMethod
   public void inserirGrupoAlimentar(grupoAlimentar gAlimentar) throws Exception;

   public void excluirGrupoAlimentar(grupoAlimentar gAlimentar) throws Exception;

   public void buscarGrupoPorId(int id);

   public ArrayList<grupoAlimentar> listarGrupoAlimentar();

}
