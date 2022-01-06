package com.kyle.design.state.general.simple;

/**
 * Description :  Test class
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class StateDrive {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateB());
        context.handle();
    }
}
