package com.hiwijaya.javalogging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

/**
 * @author Happy Indra Wijaya
 */
public class MainTest {

    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    void testLog(){
        System.out.println("Hello Logger");
        log.info("Hello Logger");
    }

}
