package com.kyle.design.proxy.staticproxy;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class ProxySubject implements Subject {

    private ConcreteSubjectA subjectA;

    public ProxySubject(ConcreteSubjectA subjectA) {
        this.subjectA = subjectA;
    }

    @Override
    public void sendRequest() {
        System.out.println("ProxySubject handle request...");
        subjectA.sendRequest();
        System.out.println("End Handling...");
    }
}
