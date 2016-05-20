package com.savdev.web.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.savdev.web.service.api.HelloService;

/**
 * TODO, still cannot resolve
 * http://stackoverflow.com/questions/37328274/connect-soap-client-without-generation-and-without-endpointinterface-setting
 */
public class HelloServiceWithoutEndpointInterface {
    public static final String targetNamespace = "http://service.web.savdev.com/";
    public static final String serviceName = "HelloServiceImplWithoutEndpointInterfaceService";
    public static final String portName = "HelloServiceImplWithoutEndpointInterfacePort";

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(HelloService.SERVICE_LOCATION + "?wsdl");

        //1st argument service URI (namespaceURI), refer to wsdl document above,
        //2nd argument is service name, refer to wsdl document above
        //in wsdl file, that is returned when we run the service publisher:
        //targetNamespace="http://service.web.savdev.com/" name="HelloServiceImplWithoutEndpointInterfaceService"
        QName qname = new QName(targetNamespace, serviceName);
        Service service = Service.create(url, qname);

        QName portQName = new QName(targetNamespace, portName);
        HelloService hello = service.getPort(portQName, HelloService.class);

        System.out.println(hello.sayHello("Alex"));
    }
}
