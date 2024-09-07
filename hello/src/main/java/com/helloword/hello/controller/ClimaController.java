package com.helloword.hello.controller;

import com.helloword.hello.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClimaController {

    Service service = new Service();

    @GetMapping("/clima")
    public String preverTempo() {
        return service.preverTempo();
    }
}

//6879 id de BH