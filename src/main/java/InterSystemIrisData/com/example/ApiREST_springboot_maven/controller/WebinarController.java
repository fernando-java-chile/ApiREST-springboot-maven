package InterSystemIrisData.com.example.ApiREST_springboot_maven.controller;

import InterSystemIrisData.com.example.ApiREST_springboot_maven.service.WebinarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import InterSystemIrisData.com.example.ApiREST_springboot_maven.DTO.Webinar;

import java.util.List;

@RestController
@RequestMapping("/v1/webinars")
public class WebinarController {
    @Autowired
    private WebinarService webinarService;

    @GetMapping
    public List<Webinar> getAllWebinars() {
        return webinarService.getAllWebinars();
    }

    @PostMapping
    public void addWebinar(@RequestBody Webinar webinar) {
        webinarService.addWebinar(webinar);
    }

    @DeleteMapping("/{webinarID}")
    public void deleteWebinar(@PathVariable int webinarID) {
        webinarService.removeWebinar(webinarID);
    }


}
