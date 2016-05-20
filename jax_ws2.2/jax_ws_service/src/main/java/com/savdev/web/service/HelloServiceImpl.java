package com.savdev.web.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.savdev.web.service.api.HelloService;

/**
 *
 */
@WebService(endpointInterface = "com.savdev.web.service.api.HelloService")
public class HelloServiceImpl implements HelloService{

    private final String message = "Hello, ";

    @WebMethod
    @Override
    public String sayHello(final String name) {
        return message + name + ".";
    }
}
