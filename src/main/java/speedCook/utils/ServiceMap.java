package speedCook.utils;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(consumes = "application/json", produces = "application/json")
public interface ServiceMap {

}
