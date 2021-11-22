package com.kyle.design.template.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description : 具体实现类B
 */
public class ConcreteTemplateB extends AbstractTemplate {

    @Override
    protected void stepTwo() {
        System.out.println("ConcreteTemplateB::stepTwo");
    }
}