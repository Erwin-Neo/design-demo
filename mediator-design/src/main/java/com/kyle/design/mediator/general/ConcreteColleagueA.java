package com.kyle.design.mediator.general;

/**
 * Description : Concrete colleague A
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
        this.mediator.setColleagueA(this);
    }


    public void selfMethodA() {
        System.out.println(String.format("%s:self-Method", this.getClass().getSimpleName()));
    }

    public void depMethodA() {
        System.out.println(String.format("%s:depMethod: delegate to Mediator", this.getClass().getSimpleName()));
        this.mediator.transferA();
    }
}