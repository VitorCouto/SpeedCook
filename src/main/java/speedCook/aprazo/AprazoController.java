package speedCook.aprazo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;
import speedCook.utils.ServicePath;

@RestController
@RequestMapping(path= ServicePath.APRAZO_PATH)
public class AprazoController extends GenericService<AprazoEntity, Long> {

}
