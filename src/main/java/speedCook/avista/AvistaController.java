package speedCook.avista;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;

@RestController
@RequestMapping(path = "/avista")
public class AvistaController extends GenericService<AvistaEntity, Long> {

}
