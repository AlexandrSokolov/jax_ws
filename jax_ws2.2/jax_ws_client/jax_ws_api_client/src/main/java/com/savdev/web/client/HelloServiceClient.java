package com.savdev.web.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.savdev.web.service.api.HelloService;

/**
 *
 */
public class HelloServiceClient {
    public static final String targetNamespace = "http://service.web.savdev.com/";
    public static final String serviceName = "HelloServiceImplService";

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(HelloService.SERVICE_LOCATION + "?wsdl");

        //1st argument service URI (namespaceURI), refer to wsdl document above,
        //2nd argument is service name, refer to wsdl document above
        //in wsdl file, that is returned when we run the service publisher:
        //targetNamespace="http://service.web.savdev.com/" name="HelloServiceImplService"
        QName qname = new QName(targetNamespace, serviceName);
        Service service = Service.create(url, qname);
        HelloService hello = service.getPort(HelloService.class);

        System.out.println(hello.sayHello("Alex"));
    }
}
