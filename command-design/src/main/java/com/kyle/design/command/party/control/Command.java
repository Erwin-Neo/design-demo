package com.kyle.design.command.party.control;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-23 10:27
 * @description :
 */
public interface Command {

    void execute();
    void undo();
}
