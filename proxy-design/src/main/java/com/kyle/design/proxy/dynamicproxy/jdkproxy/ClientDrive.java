package com.kyle.design.proxy.dynamicproxy.jdkproxy;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class ClientDrive {

    public static void main(String[] args) {

        JDKProxy jdkProxy = new JDKProxy();

        Subject subjectA = jdkProxy.getInstance(new ConcreteSubjectA());
        subjectA.request();

        System.out.println("==========>");

        Subject subjectB = jdkProxy.getInstance(new ConcreteSubjectB());
        subjectB.request();
    }
}
