package com.hiwijaya.javalogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Happy Indra Wijaya
 */
public class MyService {

    private static final Logger log = LoggerFactory.getLogger(MyService.class);

    private MyRepository repository;

    public MyService(MyRepository repository){
        this.repository = repository;
    }

    public void save(){
        log.info("service save");
        this.repository.save();
    }

}
