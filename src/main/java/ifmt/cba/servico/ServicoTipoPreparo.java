package ifmt.cba.servico;

import java.util.ArrayList;
import ifmt.cba.vo.tipoPreparo;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ServicoTipoPreparo {
    @WebMethod
    public void inserirTipoPreparo(tipoPreparo tPreparo) throws Exception;

    public void excluirTipoPreparo(tipoPreparo tPreparo) throws Exception;

    public void buscarTipoPreparo(int id);

    public ArrayList<tipoPreparo> listarTipoPreparo();
}
