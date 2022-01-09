package com.kyle.design.mediator.general;

/**
 * Description : Concrete colleague B
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
        this.mediator.setColleagueB(this);
    }

    public void selfMethodB() {
        System.out.println(String.format("%s:self-Method", this.getClass().getSimpleName()));
    }

    public void depMethodB() {
        System.out.println(String.format("%s:depMethod: delegate to Mediator", this.getClass().getSimpleName()));
        this.mediator.transferB();
    }
}