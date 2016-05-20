package com.savdev.com.savdev.web.publisher;

import javax.xml.ws.Endpoint;

import com.savdev.web.service.HelloServiceImpl;
import com.savdev.web.service.api.HelloService;

/**
 *
 */
public class HelloServicePublisher {
    public static void main( String[] args )
    {
        System.out.println("Current location: " + HelloService.SERVICE_LOCATION);
        Endpoint.publish(HelloService.SERVICE_LOCATION, new HelloServiceImpl());
    }
}
