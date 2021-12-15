package com.kyle.design.observer.general;

/**
 * Description : Test class
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ClientDrive {

    public static void main(String[] args) {
        // Subject
        Subject<String> observable = new ConcreteSubject<String>();
        // Observer
        Observer<String> observer = new ConcreteObserver<String>();
        // Register
        observable.attach(observer);
        // Notify
        observable.notify("hello");
    }
}
