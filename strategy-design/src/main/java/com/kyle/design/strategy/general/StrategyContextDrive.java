package com.kyle.design.strategy.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class StrategyContextDrive {

    public static void main(String[] args) {

        // 策略选择
        Strategy strategyA = new ConcreteStrategyA();

        // 上下文环境
        Context context = new Context(strategyA);

        // 执行算法策略
        context.executeAlgorithm();
        
    }
}
