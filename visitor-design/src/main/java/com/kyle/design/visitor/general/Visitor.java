package com.kyle.design.visitor.general;


/**
 * Description: Abstract  Visitor
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public interface Visitor {

    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}