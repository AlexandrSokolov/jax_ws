package com.savdev.web.client;

import java.net.MalformedURLException;
import java.net.URL;

import com.savdev.web.service.HelloService;
import com.savdev.web.service.HelloServiceImplService;

/**
 * The idea is that you can generate client for one wsdl location,
 * But run it with another one
 * For instance service was run with wsdl located at:
 * http://localhost:9999/ws/hello/
 * In the generated HelloServiceImplService:
 * @WebServiceClient(... wsdlLocation = "http://localhost:9999/ws/hello?wsdl")
 *
 * New service location is:
 * http://localhost:9999/ws/hello/newLocation
 */
public class HelloClientWithRuntimeServiceLocation {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:9999/ws/hello/newLocation?wsdl");
        HelloServiceImplService helloServiceImplService = new HelloServiceImplService(url);
        HelloService helloService = helloServiceImplService.getHelloServiceImplPort();
        System.out.println(helloService.sayHello("Alex"));
    }
}
