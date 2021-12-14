package com.kyle.design.facade.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class ClientDrive {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.handleA();
        facade.handleB();
        facade.handleC();
    }
}
