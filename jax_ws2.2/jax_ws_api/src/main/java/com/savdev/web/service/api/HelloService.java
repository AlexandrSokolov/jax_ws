package com.savdev.web.service.api;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 */
@WebService
public interface HelloService {

    String SERVICE_LOCATION = "http://localhost:9999/ws/hello";
    String RUNTIME_SERVICE_LOCATION = "http://localhost:9999/ws/hello/newLocation";

    @WebMethod
    String sayHello(String name);
}
