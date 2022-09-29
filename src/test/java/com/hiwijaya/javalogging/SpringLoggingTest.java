package com.hiwijaya.javalogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class SpringLoggingTest {

    @Test
    void testLog(){

        log.trace("TEST TRACE");
        log.debug("TEST DEBUG");
        log.info("TEST INFO");
        log.warn("TEST WARN");
        log.error("TEST ERROR");

    }

    @Test
    void testLongLogging(){

        for(int i = 0; i < 200_000; i++) {
            log.trace("Hello world {}", i);
        }

    }

}
