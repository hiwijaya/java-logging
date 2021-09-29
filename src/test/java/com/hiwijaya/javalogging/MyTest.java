package com.hiwijaya.javalogging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

/**
 * @author Happy Indra Wijaya
 */
public class MyTest {

    @Test
    void testRequestId() throws InterruptedException {



        MyController controller = new MyController(new MyService(new MyRepository()));


        for(var i = 0; i < 10; i++){

           new Thread(() -> {
               String requestId = UUID.randomUUID().toString();

               MDC.put("requestId", requestId);
               controller.save();
               MDC.remove("requestId");
           }).start();

           Thread.sleep(1_000L);
        }



    }

}
