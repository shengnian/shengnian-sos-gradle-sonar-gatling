package org.shengnian.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cheng on 2017/5/14.
 */
@SpringBootApplication
@RestController
public class GradleApp {

    @RequestMapping("/")
    public String home () {
        System.out.println("Hello SG");
        return "Hello SG";
    }

    public static void main(String[] args) {
        SpringApplication.run(GradleApp.class, args);
    }

}
