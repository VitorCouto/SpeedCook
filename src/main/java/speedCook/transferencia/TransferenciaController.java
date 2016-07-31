package speedCook.transferencia;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;

@RestController
@RequestMapping(path = "/transferencia")
public class TransferenciaController extends GenericService<TransferenciaEntity, Long> {

}
