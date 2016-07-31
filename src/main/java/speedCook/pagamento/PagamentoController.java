package speedCook.pagamento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;

@RestController
@RequestMapping(path = "/pagamento")
public class PagamentoController extends GenericService<PagamentoEntity, Long> {

}
