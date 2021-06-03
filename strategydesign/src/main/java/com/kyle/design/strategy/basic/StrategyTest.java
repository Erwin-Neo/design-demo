package com.kyle.design.strategy.basic;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-06-03 22:12
 * @description :
 */
public class StrategyTest {

    public static void main(String[] args) {

        // 策略选择
        Strategy strategyA = new ConcreteStrategyA();

        // 上下文环境
        Context context = new Context(strategyA);

        // 执行算法策略
        context.executeAlgorithm();
        
    }
}
