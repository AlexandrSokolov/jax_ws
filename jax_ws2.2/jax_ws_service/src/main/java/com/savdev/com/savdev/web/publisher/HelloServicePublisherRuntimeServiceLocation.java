package com.savdev.com.savdev.web.publisher;

import javax.xml.ws.Endpoint;

import com.savdev.web.service.HelloServiceImpl;
import com.savdev.web.service.api.HelloService;

/**
 *  Use HelloServicePublisher to publish service and generate client code
 *  Use this HelloServicePublisherRuntimeServiceLocation with another location and the same service
 *  So you could check changing url location at runtime.
 */
public class HelloServicePublisherRuntimeServiceLocation {
    public static void main( String[] args )
    {
        System.out.println("Current location: " + HelloService.RUNTIME_SERVICE_LOCATION);
        Endpoint.publish(HelloService.RUNTIME_SERVICE_LOCATION, new HelloServiceImpl());
    }
}
