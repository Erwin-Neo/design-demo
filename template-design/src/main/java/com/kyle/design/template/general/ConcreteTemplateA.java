package com.kyle.design.template.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description : 具体实现类A
 */
public class ConcreteTemplateA extends AbstractTemplate {

    @Override
    protected void stepOne() {
        System.out.println("ConcreteTemplateA::stepOne");
    }
}