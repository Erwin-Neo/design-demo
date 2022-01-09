package com.kyle.design.command.general;


/**
 * Description : Invoker
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class Invoker {

    private Command mCmd;

    public Invoker(Command cmd) {
        this.mCmd = cmd;
    }

    public void action() {
        this.mCmd.execute();
    }
}