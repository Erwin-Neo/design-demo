package com.kyle.design.command.party.control;

import com.kyle.design.command.party.facility.Light;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-23 10:53
 * @description :
 */
public class LivingroomLightOffCommand implements Command {

    Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
