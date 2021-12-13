package com.kyle.design.decorator.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public abstract class Decorator extends Component {

    /**
     * Hold component object
     */
    protected Component component;

    /**
     * Constructor
     * @param component component objects
     */
    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * Forward the request to the component object,
     * can perform some additional action before, during, and after forwarding
     */
    public void operation() {
        component.operation();
    }


}