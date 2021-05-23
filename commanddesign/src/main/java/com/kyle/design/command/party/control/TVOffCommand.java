package com.kyle.design.command.party.control;

import com.kyle.design.command.party.facility.TVShow;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-23 11:05
 * @description :
 */
public class TVOffCommand implements Command {

    TVShow tvShow;

    public TVOffCommand(TVShow tvShow) {
        this.tvShow = tvShow;
    }

    @Override
    public void execute() {
        tvShow.off();
    }

    @Override
    public void undo() {
        tvShow.on();
    }
}
