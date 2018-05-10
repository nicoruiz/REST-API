package Application.Controllers;

import Application.Model.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        return "Ok";
    }
}
