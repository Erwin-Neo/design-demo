package com.kyle.design.mediator.general;


/**
 * Description : Abstract mediator
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public abstract class Mediator {

    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleague) {
        this.colleagueA = colleague;
    }

    public void setColleagueB(ConcreteColleagueB colleague) {
        this.colleagueB = colleague;
    }

    public abstract void transferA();

    public abstract void transferB();
}
