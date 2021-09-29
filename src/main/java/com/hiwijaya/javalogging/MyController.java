package com.hiwijaya.javalogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Happy Indra Wijaya
 */
public class MyController {

    private static final Logger log = LoggerFactory.getLogger(MyController.class);

    private MyService service;

    public MyController(MyService service){
        this.service = service;
    }


    public void save(){
        log.info("controller save");
        this.service.save();
    }

}
