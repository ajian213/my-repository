package com.deane.controller;

import com.deane.properties.MyProperties1;
import com.deane.properties.MyProperties2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Deane
 * Date: 2018/10/4
 * Time: 1:32 AM
 */
@RequestMapping("/properties")
@RestController
public class PropertiesController {

    private static final Logger logger = LoggerFactory.getLogger(PropertiesController.class);

    private final MyProperties1 myProperties1;

    private final MyProperties2 myProperties2;

    @Autowired
    public PropertiesController(MyProperties1 myProperties1, MyProperties2 myProperties2) {
        this.myProperties1 = myProperties1;
        this.myProperties2 = myProperties2;
    }

    @GetMapping("/1")
    public MyProperties1 myProperties1() {
        logger.info("===============================================");
        logger.info(myProperties1.toString());
        logger.info("===============================================");
        return myProperties1;
    }

    @GetMapping("/2")
    public MyProperties2 myProperties2() {
        logger.info("===============================================");
        logger.info(myProperties2.toString());
        logger.info("===============================================");
        return myProperties2;
    }
}
