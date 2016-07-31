package speedCook.sexo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;

@RestController
@RequestMapping(path="/sexo")
public class SexoController extends GenericService<SexoEntity, Long> {

}
