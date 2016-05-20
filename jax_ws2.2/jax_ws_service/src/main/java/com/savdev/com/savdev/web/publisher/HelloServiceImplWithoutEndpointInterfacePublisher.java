package com.savdev.com.savdev.web.publisher;

import javax.xml.ws.Endpoint;

import com.savdev.web.service.HelloServiceImplWithoutEndpointInterface;
import com.savdev.web.service.api.HelloService;

/**
 *
 */
public class HelloServiceImplWithoutEndpointInterfacePublisher {
    public static void main( String[] args )
    {
        Endpoint.publish(HelloService.SERVICE_LOCATION, new HelloServiceImplWithoutEndpointInterface());
    }
}
