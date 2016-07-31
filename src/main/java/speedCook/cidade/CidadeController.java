package speedCook.cidade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;

@RestController
@RequestMapping(path = "/cidade")
public class CidadeController extends GenericService<CidadeEntity, Long> {

}
