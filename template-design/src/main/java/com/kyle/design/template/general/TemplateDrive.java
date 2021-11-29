package com.kyle.design.template.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description : 模板测试类
 */
public class TemplateDrive {

    public static void main(String[] args) {
        // ConcreteTemplateA#templateMethod()测试
        AbstractTemplate template = new ConcreteTemplateA();
        template.templateMethod();

        // ConcreteTemplateB#templateMethod()测试
        template = new ConcreteTemplateB();
        template.templateMethod();
    }
}
