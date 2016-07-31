package speedCook.uf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;

@RestController
@RequestMapping(path="/uf")
public class UfController extends GenericService<UfEntity, Long> {

}