package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {

    @GetMapping(value = "/hello")
    public void hello_unmatch() {
        log.info("---------- GET hello() ----------");
    }
}
