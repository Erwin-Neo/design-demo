package com.kyle.design.proxy.staticproxy;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class ClientDrive {


    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new ConcreteSubjectA());
        proxySubject.sendRequest();
    }
}
