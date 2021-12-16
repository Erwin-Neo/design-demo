package com.kyle.design.visitor.general;

/**
 * Description: Abstract  Element
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public interface Element {

    void accept(Visitor visitor);
}
