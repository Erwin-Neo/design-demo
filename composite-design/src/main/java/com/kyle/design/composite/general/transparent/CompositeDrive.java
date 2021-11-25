package com.kyle.design.composite.general.transparent;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class CompositeDrive {

    public static void main(String[] args) {

        // 创建根节点
        Component root = new Composite("root");

        // 创建树枝节点
        Component branchA = new Composite("---branchA");
        Component branchB = new Composite("------branchB");

        // 创建叶子节点
        Component leafA = new Leaf("------leafA");
        Component leafB = new Leaf("---------leafB");
        Component leafC = new Leaf("---leafC");

        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);

        String result = root.operation();
        System.out.println(result);
    }
}
