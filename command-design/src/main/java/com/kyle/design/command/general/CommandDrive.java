package com.kyle.design.command.general;

/**
 * Description :
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class CommandDrive {

    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();

        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
