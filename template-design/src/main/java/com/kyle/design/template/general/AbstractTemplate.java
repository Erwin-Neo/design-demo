package com.kyle.design.template.general;


/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description : 抽象模板类
 */
public abstract class AbstractTemplate {

    protected void stepOne() {
        System.out.println("AbstractTemplate::stepOne");
    }

    protected void stepTwo() {
        System.out.println("AbstractTemplate::stepTwo");
    }

    protected void stepThree() {
        System.out.println("AbstractTemplate::stepThree");
    }

    /**
     * 声明为final方法，避免子类覆写
     */
    public final void templateMethod() {
        this.stepOne();
        this.stepTwo();
        this.stepThree();
    }
}