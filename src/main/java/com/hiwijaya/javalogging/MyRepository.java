package com.hiwijaya.javalogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Happy Indra Wijaya
 */
public class MyRepository {

    private static final Logger log = LoggerFactory.getLogger(MyRepository.class);

    public void save(){
        log.info("repository save");
    }

}
