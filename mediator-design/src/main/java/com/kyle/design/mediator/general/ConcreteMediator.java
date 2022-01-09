package com.kyle.design.mediator.general;

/**
 * Description : Concrete mediator
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void transferA() {
        this.colleagueB.selfMethodB();
    }

    @Override
    public void transferB() {
        this.colleagueA.selfMethodA();
    }
}