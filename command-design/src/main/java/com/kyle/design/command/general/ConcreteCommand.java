package com.kyle.design.command.general;

/**
 * Description : Concrete command
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteCommand implements Command {

    private Receiver mReceiver = new Receiver();

    public void execute() {
        this.mReceiver.action();
    }
}