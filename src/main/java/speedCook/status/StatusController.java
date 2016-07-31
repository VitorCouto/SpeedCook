package speedCook.status;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;
import speedCook.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.STATUS_PATH)
public class StatusController extends GenericService<StatusEntity, Long> {

}
