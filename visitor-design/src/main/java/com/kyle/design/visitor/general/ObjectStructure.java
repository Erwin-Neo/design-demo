package com.kyle.design.visitor.general;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: Object structure
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();

    {
        this.list.add(new ConcreteElementA());
        this.list.add(new ConcreteElementB());
    }

    public void accept(Visitor visitor) {
        for (Element element : this.list) {
            element.accept(visitor);
        }
    }
}