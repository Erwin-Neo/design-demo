package com.kyle.design.visitor.general;


/**
 * Description: Concrete element A
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteElementA implements Element {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return this.getClass().getSimpleName();
    }

}