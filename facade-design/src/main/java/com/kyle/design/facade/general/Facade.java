package com.kyle.design.facade.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class Facade {

    private SubSystemA subSystemA = new SubSystemA();

    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();


    public void handleA() {
        this.subSystemA.doA();
    }

    public void handleB() {
        this.subSystemB.doB();
    }

    public void handleC() {
        this.subSystemC.doC();
    }
}