package org.scoula.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
@Log4j
public class SampleController {
    @RequestMapping("") // url : /sample
    public void basic() {
        log.info("basic............");
    }
}
