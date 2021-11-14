package com.kyle.design.strategy.basic;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description : 具体策略A
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("执行 StrategyA....");
    }
}
