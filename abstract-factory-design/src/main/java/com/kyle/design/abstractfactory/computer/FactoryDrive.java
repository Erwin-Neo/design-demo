package com.kyle.design.abstractfactory.computer;

/**
 * Description : Client test class
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class FactoryDrive {

    public static void main(String[] args) {
        Computer mac = ComputerFactory.getComputer(new MacFactory("4 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
        System.out.println("AbstractFactory Mac Config::" + mac);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
