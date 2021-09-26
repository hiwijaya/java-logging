package com.hiwijaya.javalogging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Happy Indra Wijaya
 */
public class LogFormatTest {

    private static final Logger log = LoggerFactory.getLogger(LevelTest.class);

    @Test
    void testLogFormat() {

        log.info("without parameter");
        log.info("with parameter {}", "A");

        try {
            String name = null;
            System.out.println("Hello " + name.toUpperCase());
        }
        catch(NullPointerException ex){
            log.error("Null founded!", ex);
        }

    }

}
