package com.hiwijaya.javalogging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

/**
 * @author Happy Indra Wijaya
 */
public class MyTest {

    @Test
    void testRequestId(){

        String requestId = UUID.randomUUID().toString();

        MyController controller = new MyController(new MyService(new MyRepository()));

        MDC.put("requestId", requestId);

        controller.save();

        MDC.remove("requestId");

    }

}
