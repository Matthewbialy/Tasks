package iss.task.controler;



import iss.task.domain.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/v2/issTask")
public class IssController {

    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public ArrayList<IssTaskDto> getTask() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public IssTask getTasks() { return new IssTask("user", "user");}

    @RequestMapping(method = RequestMethod.GET, value = "getDistance")
    public IssDistance getDistance() { return new IssDistance(1);}

    @RequestMapping(method = RequestMethod.GET, value = "getVelocity")
    public IssVelocity getVelocity() { return new IssVelocity(12);}
}

