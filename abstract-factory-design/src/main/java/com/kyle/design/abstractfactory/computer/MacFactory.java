package com.kyle.design.abstractfactory.computer;

/**
 * Description : Mac factory
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class MacFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public MacFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Mac(ram, hdd, cpu);
    }

}