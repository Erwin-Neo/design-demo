package com.kyle.design.strategy.basic;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description : 具体策略B
 */
public class ConcreteStrategyB implements Strategy{

    @Override
    public void algorithm() {
        System.out.println("执行 StrategyB....");
    }
}
