package com.savdev.web.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.savdev.web.service.api.HelloService;

/**
 *
 */
//It is not necessary to define endpointInterface
//@WebService(endpointInterface = "com.savdev.web.service.api.HelloService")
//But you can meet an issue:
//http://stackoverflow.com/questions/13417454/javax-xml-ws-webserviceexception-undefined-port-type-java-struts-soap-wsdl
@WebService
public class HelloServiceImplWithoutEndpointInterface implements HelloService{

    private final String message = "Hello, ";

    @WebMethod
    @Override
    public String sayHello(final String name) {
        return message + name + ".";
    }
}
