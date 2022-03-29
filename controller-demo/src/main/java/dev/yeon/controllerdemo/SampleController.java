package dev.yeon.controllerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {
    private static final Logger logger
            = LoggerFactory.getLogger(SampleController.class);


    @RequestMapping(
            value = "hello",
            method = RequestMethod.GET
    )
    public String hello(@RequestParam(name = "id", required = false, defaultValue = "") String id){
        logger.info("Path: Hello");
        logger.info("Query Param id: " + id);
        return "/hello.html";
    }

    @GetMapping(
            value = "/hello/{id}"
    )
    public String helloPath(@PathVariable("id") String id){
        logger.info(id);
        return "/hello.html";
    }

    @GetMapping(
            "/get-profile"
    )
    public @ResponseBody SamplePayload getProfile(){
        return new SamplePayload("devyeon", 27, "Developer");
    }

}
