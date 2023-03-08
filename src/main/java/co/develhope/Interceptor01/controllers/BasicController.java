package co.develhope.Interceptor01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping("")
    public String getCurrentTime() {
        return "Current Date/Time: " + new java.util.Date();
    }
}
