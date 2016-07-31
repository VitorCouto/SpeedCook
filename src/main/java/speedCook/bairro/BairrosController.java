package speedCook.bairro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;

@RestController
@RequestMapping(path="/bairro")
public class BairrosController extends GenericService<BairroEntity, Long> {

}
