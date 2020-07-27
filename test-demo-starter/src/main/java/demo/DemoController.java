package demo;


import com.demo.starter.service.DemoDBService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {

    @Resource
    private DemoDBService demoDBService;

    @GetMapping("/connect")
    public String sayConnect() {
        return demoDBService.connectToDBserver();
    }
}
