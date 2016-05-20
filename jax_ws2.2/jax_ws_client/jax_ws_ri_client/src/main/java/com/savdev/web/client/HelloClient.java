package com.savdev.web.client;

import com.savdev.web.service.HelloService;
import com.savdev.web.service.HelloServiceImplService;

/**
 *
 */
public class HelloClient {
    public static void main(String[] args) {
        HelloServiceImplService helloServiceImplService = new HelloServiceImplService();
        HelloService helloService = helloServiceImplService.getHelloServiceImplPort();
        System.out.println(helloService.sayHello("Alex"));
    }
}
